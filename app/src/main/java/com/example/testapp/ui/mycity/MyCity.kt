package com.example.testapp.ui.mycity

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testapp.R
import com.example.testapp.logic.model.City
import kotlinx.android.synthetic.main.activity_mycity.*

class MyCity : AppCompatActivity() {
    private val tag = "MyCity.class"
    val myCityViewModel by lazy { ViewModelProvider(this).get(MyCityViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mycity)
        if (Build.VERSION.SDK_INT>23) {     // 设置状态栏
            val decoreView = window.decorView
            decoreView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR    // 设置状态栏样式
            window.statusBarColor = Color.WHITE
        }
        toolbar.setNavigationOnClickListener {// 监听返回按钮的事件
            finish()
        }

        val adapter = MyCityAdapter(this, object : DeleteImpl {
            override fun onSwipe(city: City) {
                myCityViewModel.deleteCity(city)
            }
        })
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        val simpleItemTouchHelper = CityItemTouchHelper()
        val itemTouchHelper = ItemTouchHelper(simpleItemTouchHelper)
        itemTouchHelper.attachToRecyclerView(recyclerView)

        myCityViewModel.allCities.observe(this, Observer {
            adapter.setAdapter(it)
        })
    }


}