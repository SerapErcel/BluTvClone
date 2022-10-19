package com.serapercel.blutvclone.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.serapercel.blutvclone.R

class ViewPagerAdapter(private var images: List<Int>) :
    RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder>() {

    inner class Pager2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage: ImageView = itemView.findViewById(R.id.imageView)

        init {
            itemImage.setOnClickListener { v: View ->
                val position = adapterPosition

            }
        }
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Pager2ViewHolder {
        return Pager2ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false)
        )
    }

    override fun onBindViewHolder(holder: Pager2ViewHolder, position: Int) {
        holder.itemImage.setImageResource(images[position])

    }


}