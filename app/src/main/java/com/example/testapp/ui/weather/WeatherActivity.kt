package com.example.testapp.ui.weather

import android.content.Context
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.VISIBLE
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.testapp.R
import com.example.testapp.logic.model.*
import kotlinx.android.synthetic.main.activity_weather.*
import kotlinx.android.synthetic.main.alert_item.view.*
import kotlinx.android.synthetic.main.alert_weather.*
import kotlinx.android.synthetic.main.forecast_weather.*
import kotlinx.android.synthetic.main.hourly_weather.*
import kotlinx.android.synthetic.main.realtime_weather.*
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class WeatherActivity : AppCompatActivity() {
    private val tag = "WeatherActivity.class"
    val viewModel by lazy { ViewModelProvider(this).get(WeatherViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        if (Build.VERSION.SDK_INT>21) {
            val decore = window.decorView
            decore.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            window.statusBarColor = Color.TRANSPARENT
        }
        if (viewModel.name.isEmpty()) {
            viewModel.name = intent.getStringExtra("place_name") ?: ""
        }
        if (viewModel.lng.isEmpty()) {
            viewModel.lng = intent.getStringExtra("place_lng") ?: ""
        }
        if (viewModel.lat.isEmpty()) {
            viewModel.lat = intent.getStringExtra("place_lat") ?: ""
        }
        viewModel.weatherLiveData.observe(this, Observer {
            weather ->
            val data = weather.getOrNull()
            if (data != null) {
                forecast_layout.removeAllViews()
                showRealtime(data)
                showForecast(data)
                showHourly(data)
                showAlert(data)
            }
            weather_swipeRefresh.isRefreshing = false
            scrollview_data.visibility = VISIBLE
        })
        refreshWeather()
        weather_swipeRefresh.setColorSchemeResources(R.color.blue)
        weather_swipeRefresh.setOnRefreshListener {
            refreshWeather()
        }
        home.setOnClickListener {
            drawlayout.openDrawer(GravityCompat.START)
        }
        drawlayout.addDrawerListener(object : DrawerLayout.DrawerListener{
            override fun onDrawerStateChanged(newState: Int) {

            }

            override fun onDrawerOpened(drawerView: View) {

            }

            override fun onDrawerSlide(drawerView: View, slideOffset: Float) {

            }

            override fun onDrawerClosed(drawerView: View) {
                val manager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                manager.hideSoftInputFromWindow(drawerView.windowToken, InputMethodManager.HIDE_NOT_ALWAYS) //关闭输入法
            }
        })
    }

    fun showAlert(data: Weather) {
        val content = data.realtimeResponse.result.alert.content
        alert_content_cv.visibility = if (content.isEmpty()) View.GONE else View.VISIBLE

        if (content.isNotEmpty()) {
            fl_alert.removeAllViews()

            for (item in data.realtimeResponse.result.alert.content) {
                val alertView = LayoutInflater.from(this).inflate(R.layout.alert_item, fl_alert, false)
                alertView.alert_title.text = item.title
                alertView.alert_info.text = item.description
                fl_alert.addView(alertView)
            }
        }
    }

    fun showRealtime(data: Weather) {
        realtime_tem.text = data.realtimeResponse.result.realtime.temperature.toInt().toString()
        val con = data.realtimeResponse.result.realtime.skycon
        val sky_con = getSky(con)
        realtime_con.text = sky_con.info
        weather_layout.background = getDrawable(sky_con.bg)
        realtime_quality.text = "空气质量 "+data.realtimeResponse.result.realtime.air_quality.aqi.chn.toInt().toString()
    }

    fun showForecast(data: Weather) {
        val fore_data = data.dailyResponse.result.daily
        for (i in fore_data.temperature.indices) {
            val date = fore_data.skycon[i].date
            val temperature = fore_data.temperature
            val skycon = fore_data.skycon
            val simpleDateFormat = SimpleDateFormat("yy-MM-dd", Locale("CHINA"))
            val format_date = simpleDateFormat.format(date)
            val view = LayoutInflater.from(this).inflate(R.layout.forecast_item, forecast_layout, false)
            val forecast_date = view.findViewById<TextView>(R.id.forecast_date)
            forecast_date.text = format_date
            val Sky_skycon = getSky(skycon[i].value)
            val forecast_icon = view.findViewById<ImageView>(R.id.forecast_icon)
            forecast_icon.background = getDrawable(Sky_skycon.icon)
            val forecast_des = view.findViewById<TextView>(R.id.forecast_description)
            forecast_des.text = Sky_skycon.info
            val forecast_tem = view.findViewById<TextView>(R.id.forecast_tem)
            val temText = "${temperature[i].min.toInt()} ~ ${temperature[i].max.toInt()} ℃"
            forecast_tem.text = temText
            forecast_layout.addView(view)
        }
    }

    fun showHourly(data: Weather) {
        try {
            val sunrise = data.dailyResponse.result.daily.astro[0].sunrise.time
            val sunset = data.dailyResponse.result.daily.astro[0].sunset.time
            sunrise_time.text = sunrise
            sunset_time.text = sunset
            val linechartData = ArrayList<LinechartData>()
            val hourlyData = data.hourlyWeather.result.hourly
            for (i in hourlyData.skycon.indices) {
                val time = hourlyData.skycon[i].datetime
                val simpleDateFormat = SimpleDateFormat("HH:mm", Locale("CHINA"))
                val format_time = simpleDateFormat.format(time)
                val condition = hourlyData.skycon[i].value
                val skyCondition = getSky(condition).info
                val img = getSky(condition).icon
                val direction = getDirection(hourlyData.wind[i].direction)
                val speed = getSpeed(hourlyData.wind[i].speed)
                val tem = hourlyData.temperature[i].value.toInt()
                val maxTem = hourlyData.temperature.maxBy { it.value }!!.value.toInt()
                val minTem = hourlyData.temperature.minBy { it.value }!!.value.toInt()
                val data = LinechartData(format_time, skyCondition, img, maxTem, minTem, tem, direction, speed)
                linechartData.add(data)
            }
            hourly_weather.setData(linechartData)
        }catch (e: Exception) {
            Log.d(tag, e.toString())
        }
    }

    fun refreshWeather() {
        viewModel.refresh(viewModel.lng, viewModel.lat)
        city_name.text = viewModel.name
        weather_swipeRefresh.isRefreshing = true
    }
}