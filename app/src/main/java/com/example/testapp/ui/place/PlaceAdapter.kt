package com.example.testapp.ui.place

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.MainActivity
import com.example.testapp.R
import com.example.testapp.logic.model.Place
import com.example.testapp.ui.weather.WeatherActivity
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_weather.*
import org.w3c.dom.Text
import java.lang.Exception

class PlaceAdapter(private val fragment: PlaceFragment, val list: List<Place>):RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val place_name = view.findViewById<TextView>(R.id.name)
        val place_address = view.findViewById<TextView>(R.id.address)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.place_item, parent, false)
        val holder = ViewHolder(view)
        holder.itemView.setOnClickListener {
            val position = holder.adapterPosition
            val place = list[position]
            val activity = fragment.activity
            try {
                activity as WeatherActivity
            }catch (e: Exception) {
                Log.d("PlaceAdapter.class", e.toString())
            }

            if (activity is WeatherActivity) {
                activity.drawlayout.closeDrawers()
                activity.viewModel.name = place.name
                activity.viewModel.lat = place.location.lat
                activity.viewModel.lng = place.location.lng
                activity.refreshWeather()
            } else {
                val intent = Intent(parent.context,WeatherActivity::class.java).apply {
                    putExtra("place_lng", place.location.lng)
                    putExtra("place_lat", place.location.lat)
                    putExtra("place_name", place.name)
                }
                fragment.startActivity(intent)
                fragment.activity?.finish()
            }

            fragment.viewModel.savePlace(place)

        }
        return holder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.place_name.text = list[position].name
        holder.place_address.text = list[position].formatted_address
    }

    override fun getItemCount(): Int {
        return list.size
    }
}