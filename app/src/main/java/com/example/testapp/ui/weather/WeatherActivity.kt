package com.example.testapp.ui.weather

import android.content.Context
import android.graphics.Color
import android.inputmethodservice.InputMethodService
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
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
import com.example.testapp.logic.Repository
import com.example.testapp.logic.model.Sky
import com.example.testapp.logic.model.Weather
import com.example.testapp.logic.model.getSky
import kotlinx.android.synthetic.main.activity_weather.*
import kotlinx.android.synthetic.main.forecast_item.*
import kotlinx.android.synthetic.main.forecast_weather.*
import kotlinx.android.synthetic.main.realtime_weather.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class WeatherActivity : AppCompatActivity() {
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
            }
            weather_swipeRefresh.isRefreshing = false
            scrollview_data.visibility = VISIBLE
        })
        refreshWeather()
        weather_swipeRefresh.setColorSchemeResources(R.color.colorAccent, R.color.colorPrimary)
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

    fun showRealtime(data: Weather) {
        realtime_tem.text = String.format(getString(R.string.realtime_temperature), data.realtimeResponse.result.realtime.temperature.toInt())
        val con = data.realtimeResponse.result.realtime.skycon
        val sky_con = getSky(con)
        realtime_con.text = sky_con.info
        weather_layout.background = getDrawable(sky_con.bg)
        realtime_quality.text = String.format(getString(R.string.realtime_quality), data.realtimeResponse.result.realtime.air_quality.aqi.chn.toInt())
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

    fun refreshWeather() {
        viewModel.refresh(viewModel.lng, viewModel.lat)
        city_name.text = viewModel.name
        weather_swipeRefresh.isRefreshing = true
    }
}