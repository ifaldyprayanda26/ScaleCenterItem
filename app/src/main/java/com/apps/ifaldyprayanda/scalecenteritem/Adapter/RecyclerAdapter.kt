package com.apps.ifaldyprayanda.scalecenteritem.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.apps.ifaldyprayanda.scalecenteritem.R
import com.squareup.picasso.Picasso

class RecyclerAdapter (private val imageUrls: MutableList<String>) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>()
{
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val img_display: ImageView
        init{
            img_display = itemView.findViewById(R.id.simple_image) as ImageView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false))
    }

    override fun getItemCount(): Int {
        return imageUrls.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Picasso.get().load(imageUrls[position]).into(holder.img_display)
    }
}