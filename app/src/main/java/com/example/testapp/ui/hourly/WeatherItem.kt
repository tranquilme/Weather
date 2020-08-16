package com.example.testapp.ui.hourly

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.testapp.R
import kotlinx.android.synthetic.main.hourly_item.view.*

class WeatherItem(context: Context): LinearLayout(context) {
    private var time: TextView  //时间
    private var skycon: TextView
    private var skyconImg: ImageView
    private var tem:Temperature //温度
    private var windDirection: TextView
    private var speed: TextView

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.hourly_item, null)
        time = view.findViewById(R.id.time)
        skycon = view.findViewById(R.id.skycon)
        skyconImg = view.findViewById(R.id.skycon_img)
        tem = view.findViewById(R.id.temperature)
        windDirection = view.findViewById(R.id.direction)
        speed = view.findViewById(R.id.speed)
        view.layoutParams = LayoutParams(       //设置View的宽高属性
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        addView(view)   //将View添加到ViewGroup中
    }


    fun setTime(time: String) { //设置相关数据
        this.time.text = time
    }

    fun setSkyCon(condition: String) {
        skycon.text = condition
    }

    fun setSkyconImg(img: Int) {
        skyconImg.setImageResource(img)
    }

    fun setMaxTem(max: Int) {
        tem.setMaxTem(max)
    }

    fun setMinTem(min: Int) {
        tem.setMinTem(min)
    }

    fun setTem(temperature: Int) {
        tem.setTem(temperature)
    }

    fun setDirection(dirction: String) {
        this.direction.text = dirction
    }

    fun setSpeed(speed: String) {
        this.speed.text = speed
    }
}