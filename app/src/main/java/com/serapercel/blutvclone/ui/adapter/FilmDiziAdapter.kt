package com.serapercel.blutvclone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.serapercel.blutvclone.data.entity.Film
import com.serapercel.blutvclone.databinding.FilmDiziCardBinding

class FilmDiziAdapter(var mContext: Context, var filmDiziListesi: List<Film>) :
    RecyclerView.Adapter<FilmDiziAdapter.FilmDiziCardHolder>() {
    inner class FilmDiziCardHolder(val binding: FilmDiziCardBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmDiziCardHolder {
        val binding = FilmDiziCardBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return FilmDiziCardHolder(binding)
    }

    override fun onBindViewHolder(holder: FilmDiziCardHolder, position: Int) {
        val filmDizi = filmDiziListesi[position]
        val b = holder.binding
        b.filmDiziImage.setImageResource(filmDizi.image)
    }

    override fun getItemCount(): Int = filmDiziListesi.size

}