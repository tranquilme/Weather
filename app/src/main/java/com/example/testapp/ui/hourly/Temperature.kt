package com.example.testapp.ui.hourly

import android.content.Context
import android.graphics.*
import android.os.Build
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.annotation.RequiresApi
import com.example.testapp.R

class Temperature: View {
    @RequiresApi(23)
    constructor(context: Context):super(context) {
        init()
    }

    @RequiresApi(23)
    constructor(context: Context, attributeSet: AttributeSet):super(context, attributeSet){
        init()
    }

    private var pointX = 0F //圆的横坐标
    private var pointY = 0F //圆的纵坐标
    private var maxTem = 0  //一天中气温的最大值
    private var minTem = 0
    private var tem = 0     //当前温度
    private val radius = 6F //圆的半径
    private lateinit var paint: Paint
    private lateinit var textPaint: Paint

    @RequiresApi(Build.VERSION_CODES.M)
    fun init() {    //初始化两个Paint
        paint = Paint()
        paint.color = context.getColor(R.color.blue)
        textPaint = Paint()
        textPaint.color = context.getColor(R.color.blue)
        textPaint.textSize = 30F
        textPaint.typeface = Typeface.DEFAULT_BOLD
        textPaint.textAlign = Paint.Align.CENTER
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        drawPoint(canvas)
        drawText(canvas)
        Log.d("WeatherView.class", "Temperature onDraw")
    }

    fun drawPoint(canvas: Canvas?) {    //画圆
        val height = height - 100   // - 100 是为了让点的位置上移，更加美观
        val width = width/2F
        val pointHeight = height - height * ((tem - minTem)*1.0F / (maxTem - minTem)) + 50  //根据当前温度的值设置高度，温度越高，值越小
        pointX = width
        pointY = pointHeight
        canvas?.drawCircle(width, pointHeight, radius, paint)
    }

    fun drawText(canvas: Canvas?) {     //画文字
        val content = "${tem}℃"
        val height = height - 100
        val width = width/2
        val textHeight = height-height * ((tem - minTem)*1.0F / (maxTem - minTem)) + 30
        canvas?.drawText(content, width.toFloat(), textHeight, textPaint)

    }

    fun setMaxTem(maxTem: Int) {    //初始化相关值
        this.maxTem = maxTem
    }

    fun setMinTem(minTem: Int) {
        this.minTem = minTem
    }

    fun setTem(tem: Int) {
        this.tem = tem
        invalidate()
    }

    fun getPointX(): Float {    //获取圆的横坐标，后面画折线要用到
        return pointX
    }

    fun getPointY(): Float {
        return pointY
    }
}