package com.example.testapp.ui.hourly

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.example.testapp.R
import com.example.testapp.logic.model.LinechartData

class WeatherView: HorizontalScrollView {
    @RequiresApi(23)
    constructor(context: Context):super(context) {
        init()
    }

    @RequiresApi(23)
    constructor(context: Context, attributeSet: AttributeSet): super(context, attributeSet) {
        init()
    }

    private lateinit var paint: Paint
    private val tag = "WeatherView.class"

    @RequiresApi(23)
    fun init() {    //初始化Paint
        paint = Paint()
        paint.color = context.getColor(R.color.blue)
        paint.isAntiAlias = true
        paint.strokeWidth = 6f
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        if (childCount > 0) {
            val root = getChildAt(0) as LinearLayout    // 获取WeatherView的子视图
            for (i in 0..10) {       // 循环，画折线
                val tem1 = root.getChildAt(i)       // 获取LinearLayout子视图WeatherItem
                val temView1 = tem1.findViewById<Temperature>(R.id.temperature)
                val tem2 = root.getChildAt(i + 1)
                val temView2 = tem2.findViewById<Temperature>(R.id.temperature)
                val time = tem1.findViewById<TextView>(R.id.time)   // 实例化控件
                val skyCon = tem1.findViewById<TextView>(R.id.skycon)
                val skyConImg = tem1.findViewById<ImageView>(R.id.skycon_img)
                val moreHeight = time.height + skyCon.height + skyConImg.height +8f
                val pointX1 = temView1.getPointX() + tem1.width * i
                val pointY1 = temView1.getPointY() + moreHeight
                val pointX2 = temView2.getPointX() + tem1.width * (i + 1)
                val pointY2 = temView2.getPointY() + moreHeight     // 获取折线两个端点的值
                if (temView1.getPointY() == 0f) {   // 子View的onDraw() 在父View之后
                    invalidate()                    // 调用draw() , 刷新界面, 再调用父View的onDraw()，此时子View onDraw()完成
                } else {                            // 获取到数据之后再画折线图
                    canvas?.drawLine(pointX1, pointY1, pointX2, pointY2, paint)
                }
            }
        }
    }

    fun setData(weatherData: List<LinechartData>) {   // 设置初始值
        val window = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val width = window.defaultDisplay.width     // 获取屏幕宽度
        removeAllViews()
        val linearLayout = LinearLayout(context)    // 由于HorizontalScrollView只能有一个子View，所以需要把WeatherItem加到LinearLayout里
        linearLayout.layoutParams = LayoutParams(   // 设置宽高
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        linearLayout.orientation = LinearLayout.HORIZONTAL
        for (i in 0..11) {       // 添加WeatherItem
            val item = WeatherItem(context)
            val data = weatherData[i]
            item.setTime(data.time)
            item.setSkyCon(data.condition)
            item.setSkyconImg(data.img)
            item.setMaxTem(data.maxTem)
            item.setMinTem(data.minTem)
            item.setTem(data.tem)
            item.setDirection(data.direction)
            item.setSpeed(data.speed)
            item.layoutParams = LinearLayout.LayoutParams(
                width / 5,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
            linearLayout.addView(item)
        }
        addView(linearLayout)   // addView之后会刷新视图
    }


}