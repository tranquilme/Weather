package com.example.testapp.ui.mycity

import android.app.Activity.RESULT_OK
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R
import com.example.testapp.logic.model.City
import com.example.testapp.logic.model.Location
import com.example.testapp.logic.model.Place
import com.example.testapp.ui.weather.WeatherActivity
import kotlinx.android.synthetic.main.recycleitem_mycity.view.*
import java.lang.Exception

class MyCityAdapter(val context: Context, private val deleteImpl: DeleteImpl) :
    RecyclerView.Adapter<MyCityAdapter.MyVh>() {
    private val tag = "MainAdapter.class"
    private var flag: Int = 0 // 第一次初始化
    private var data = emptyList<City>()

    class MyVh(view: View) : RecyclerView.ViewHolder(view) {
        val cityName: TextView = view.findViewById(R.id.cityName)
        val cityLat: TextView = view.findViewById(R.id.cityLat)
        val cityLng: TextView = view.findViewById(R.id.cityLng)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVh {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycleitem_mycity, parent, false)
        return MyVh(view)
    }

    override fun onBindViewHolder(holder: MyVh, position: Int) {
        val cityData = data[position]
        holder.cityName.text = cityData.cityName
        if (cityData.lat.toFloat() > 0) {   // 北纬坐标
            val lat = String.format("lat: %.3f°N", cityData.lat.toFloat())
            holder.cityLat.text = lat
        } else {       // 南纬坐标
            val lat = String.format("lat: %.3f°S", cityData.lat.toFloat())
            holder.cityLat.text = lat
        }

        if (cityData.lng.toFloat() > 0) {   // 东经坐标
            val lng = String.format("lng: %.3f°E", cityData.lng.toFloat())
            holder.cityLng.text = lng
        } else {    // 西经坐标
            val lng = String.format("lng: %.3f°W", cityData.lng.toFloat())
            holder.cityLng.text = lng
        }

//        holder.cityAQI.text = data[position].cityAQI
//        val temp = "${data[position].cityTempMax}° / ${data[position].cityTempMin}°"
//        holder.cityTemp.text = temp
//        val nowTemp = "${data[position].cityNowTemp}°"
//        holder.nowTemp.text = nowTemp
        holder.itemView.delete.translationX = 0f     // 保证复用 viewholder 的时候不会出错
        holder.itemView.content.translationX = 0f
        holder.itemView.delete.setOnClickListener {
            try {
                deleteImpl.onSwipe(cityData)
                (data as ArrayList<City>).removeAt(holder.adapterPosition)
                // notifyItemRemoved 会重新绘制布局，所以要删除 data 列表的数据，不然删除的项还是会添加回来。
                notifyItemRemoved(holder.adapterPosition)   // 如果使用 positoin 参数，会使得删除的是其他item，因为 position 参数不会自动更新。
            } catch (e: Exception) {
                Log.d(tag, e.toString())
            }
        }

        holder.itemView.content.setOnClickListener {// 跳转到对应城市的Weather界面
            try {
                val intent = Intent(holder.itemView.context, WeatherActivity::class.java).apply {
                    putExtra("place_lng", cityData.lng)
                    putExtra("place_lat", cityData.lat)
                    putExtra("place_name", cityData.cityName)
                }
                context.startActivity(intent)
                (context as MyCity).setResult(RESULT_OK)    // 返回值到上一个WeatherActivity，用于finish
                val place = Place(cityData.cityName, Location(cityData.lng, cityData.lat), cityData.address)
                context.myCityViewModel.savePlace(place)
                context.finish()
            } catch (e: Exception) {
                Log.d(tag, e.toString())
            }
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun setAdapter(data: List<City>) {
        this.data = data
        if (flag == 0) {    // 如果是第一次加载
            flag = 1
            notifyDataSetChanged()
        }
    }

}