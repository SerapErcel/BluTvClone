package com.serapercel.blutvclone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.serapercel.blutvclone.R
import com.serapercel.blutvclone.data.entity.Film
import com.serapercel.blutvclone.databinding.IzlmeyeDevamEtCardBinding

class IzlemeyeDevamEtAdapter(var mContext: Context, var filmlerListesi: List<Film>) :
    RecyclerView.Adapter<IzlemeyeDevamEtAdapter.IzlemeyeDevamEtCardHolder>() {

    inner class IzlemeyeDevamEtCardHolder(val binding: IzlmeyeDevamEtCardBinding) :
        RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IzlemeyeDevamEtCardHolder {
        val binding =
            IzlmeyeDevamEtCardBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return IzlemeyeDevamEtCardHolder(binding)
    }

    override fun onBindViewHolder(holder: IzlemeyeDevamEtCardHolder, position: Int) {
        val film = filmlerListesi[position]
        val b = holder.binding
        b.zamanTextView.text = film.time
        b.izlemeyeDevamEtImage.setImageResource(film.image)
    }

    override fun getItemCount(): Int = filmlerListesi.size

}