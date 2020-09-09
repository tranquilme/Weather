package com.example.testapp.ui.mycity

import android.graphics.Canvas
import android.util.Log
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycleitem_mycity.view.*

class CityItemTouchHelper(): ItemTouchHelper.Callback() {
    private val tag = "SimpleItem.class"

    override fun getMovementFlags(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder
    ): Int {
        return makeMovementFlags(0 , ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT)  // 设置可以左右滑动
    }

    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        return false
    }

    override fun onSelectedChanged(viewHolder: RecyclerView.ViewHolder?, actionState: Int) {    // 侧滑过程
        super.onSelectedChanged(viewHolder, actionState)
        if (actionState != ItemTouchHelper.ACTION_STATE_IDLE) {
            viewHolder?.itemView?.scaleX = 19/20f
            viewHolder?.itemView?.scaleY = 19/20f
        }
    }

    override fun clearView(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder) {   // 侧滑结束
        super.clearView(recyclerView, viewHolder)
        viewHolder.itemView.scaleX = 1f
        viewHolder.itemView.scaleY = 1f
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {    // 当item被移除的时候调用
        Log.d(tag, "onSwipe")
    }

    // 设置移除item的最小滑动宽度
    override fun getSwipeThreshold(viewHolder: RecyclerView.ViewHolder): Float {
        return Int.MAX_VALUE.toFloat()
    }

    // 设置移除item的最小滑动速度
    override fun getSwipeEscapeVelocity(defaultValue: Float): Float {
        return Int.MAX_VALUE.toFloat()
    }


    override fun onChildDraw(       // 滑动 item 时调用此方法
        c: Canvas,
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        dX: Float,
        dY: Float,
        actionState: Int,
        isCurrentlyActive: Boolean
    ) {
        //super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive) //默认的移动动画L

        val deleteWidth  = viewHolder.itemView.delete.width     // 删除图标的宽度
        val tranX = viewHolder.itemView.content.translationX

        if (dX >= 0) {
            viewHolder.itemView.content.translationX = (dX - deleteWidth)
            viewHolder.itemView.delete.translationX = (dX - deleteWidth)
            if (tranX > -deleteWidth / 2) {         // 当右滑到 1/2 删除图标的宽度时，恢复原来的位置
                viewHolder.itemView.content.translationX = 0f
                viewHolder.itemView.delete.translationX = 0f
            }
        } else {
            if (viewHolder.itemView.content.translationX < - deleteWidth / 2) {        // 如果滑动的距离大于删除View的 1/2
                viewHolder.itemView.content.translationX = -deleteWidth.toFloat()
                viewHolder.itemView.delete.translationX = -deleteWidth.toFloat()
            } else {
                viewHolder.itemView.content.translationX = dX
                viewHolder.itemView.delete.translationX = dX
            }
        }
//          viewHolder.itemView.scrollX = -dX.toInt()                 // CardView  中的内容不包括屏幕之外的View
        // x = left + translationX  left是View 距离父View的初始值，不会改变。
//        viewHolder.itemView.content.scrollX = -dX.toInt()           // setScroll() 是对View内的 内容的滚动,内容滚出自己所在的View范围就不可见。
//        Log.d(tag, viewHolder.itemView.content.scrollX.toString())  // getScroll() 获取View内的 内容 相对 View 的滚动距离
//        viewHolder.itemView.content.translationX = dX                 // setTranslation() 是对View的平移，平移方向与X方向相同
//        Log.d(tag, viewHolder.itemView.content.translationX.toString())// getTranslation() 获取View相对父View的平移距离
    }
}