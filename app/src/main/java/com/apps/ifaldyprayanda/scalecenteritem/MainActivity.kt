package com.apps.ifaldyprayanda.scalecenteritem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.apps.ifaldyprayanda.scalecenteritem.Adapter.RecyclerAdapter
import com.apps.ifaldyprayanda.scalecenteritem.LayoutManager.ScaleCenterItemLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = ScaleCenterItemLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        simple_rv.layoutManager = layoutManager

        //for generate item
        generateItem()
    }

    private fun generateItem() {
        val random = Random()
        val list = ArrayList<String>()
        for (i in 0 until 10)
            list.add("https://piscum.photo/150/150?random="+random.nextInt()) // Random image url (Change url with you url)

        val adapter = RecyclerAdapter(list)
        simple_rv.adapter = adapter

    }
}