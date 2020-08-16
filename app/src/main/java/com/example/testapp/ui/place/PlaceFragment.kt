package com.example.testapp.ui.place

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testapp.MainActivity
import com.example.testapp.R
import com.example.testapp.ui.weather.WeatherActivity
import kotlinx.android.synthetic.main.fragment_place.*

class PlaceFragment: Fragment() {
    lateinit var adapter: PlaceAdapter
    val viewModel by lazy{ViewModelProvider(this).get(PlaceViewModel::class.java)}

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_place, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
            // 如果不判断 activity is MainActivity ，由于WeatherActivity中也有 fragment，会导致一直跳转。
        if (activity is MainActivity && viewModel.isPlaceSaved()) {     //选择过城市了
            val place = viewModel.getPlace()
            val intent = Intent(context, WeatherActivity::class.java).apply {
                putExtra("place_lng", place.location.lng)
                putExtra("place_lat", place.location.lat)
                putExtra("place_name", place.name)
            }
            startActivity(intent)
            activity?.finish()
            return
        }
        val layoutManager = LinearLayoutManager(activity)
        place_fragment_recyclerview.layoutManager = layoutManager
        adapter = PlaceAdapter(this, viewModel.placeList)
        place_fragment_recyclerview.adapter = adapter
        search_edit.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val text = s.toString()
                if (text.isEmpty() ) {
                    viewModel.placeList.clear()
                    place_fragment_recyclerview.visibility = View.GONE
                    fragment_place_background.visibility = View.VISIBLE
                }else {
                    viewModel.queryPlaces(text)
                }
            }
        })
        viewModel.placesLiveData.observe(viewLifecycleOwner, Observer {
            result ->
            val places = result.getOrNull()
            if (places != null) {
                place_fragment_recyclerview.visibility = View.VISIBLE
                fragment_place_background.visibility = View.GONE
                viewModel.placeList.clear()
                viewModel.placeList.addAll(places)
                adapter.notifyDataSetChanged()
            } else {
                viewModel.placeList.clear()
                place_fragment_recyclerview.visibility = View.GONE
                fragment_place_background.visibility = View.VISIBLE
                Toast.makeText(context, "未查询到数据", Toast.LENGTH_SHORT).show()
            }
        })


    }
}