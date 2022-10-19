package com.serapercel.blutvclone.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.serapercel.blutvclone.R
import com.serapercel.blutvclone.data.entity.Film
import com.serapercel.blutvclone.ui.adapter.ViewPagerAdapter
import com.serapercel.blutvclone.databinding.FragmentKesfetBinding
import com.serapercel.blutvclone.ui.adapter.FilmDiziAdapter
import com.serapercel.blutvclone.ui.adapter.IzlemeyeDevamEtAdapter


class KesfetFragment : Fragment() {
    private lateinit var binding: FragmentKesfetBinding
    private var imageList = mutableListOf<Int>()
    private var filmList = mutableListOf<Film>()
    private var polisiyeRuzgari = mutableListOf<Film>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentKesfetBinding.inflate(inflater, container, false)
        addToList(R.drawable.gri_degil_siyah)
        addToList(R.drawable.gri_degil_siyah)
        addToList(R.drawable.gri_degil_siyah)

        val film = Film("Six Feet Under", R.drawable.six_feet_under, "S1 B2 - 59dk")
        val film1 = Film( "Börü", R.drawable.boru, "S1 B2 - 59dk")
        val film2 = Film( "Börü", R.drawable.boru, "S1 B2 - 59dk")

        addFilm(film, filmList)
        addFilm(film1, filmList)
        addFilm(film2, filmList)

        val polisiye1 = Film("The Responder", R.drawable.the_responder, "S1 B2 - 59dk")
        val polisiye2 = Film( "Perpetual Grace", R.drawable.perpetual_grace, "S1 B2 - 59dk")
        val polisiye3 = Film( "The Investigation", R.drawable.the_investigation, "S1 B2 - 59dk")

        addFilm(polisiye1, polisiyeRuzgari)
        addFilm(polisiye2, polisiyeRuzgari)
        addFilm(polisiye3, polisiyeRuzgari)
        addFilm(polisiye1, polisiyeRuzgari)
        addFilm(polisiye2, polisiyeRuzgari)
        addFilm(polisiye3, polisiyeRuzgari)


        binding.izlemeyeDevamEtRV.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val adapterIzlemeyeDevamEt = IzlemeyeDevamEtAdapter(requireContext(),filmList)
        binding.izlemeyeDevamEtRV.adapter= adapterIzlemeyeDevamEt

        binding.polisiyeRuzgariRV.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val adapterPolisiyeRuzgari = FilmDiziAdapter(requireContext(),polisiyeRuzgari)
        binding.polisiyeRuzgariRV.adapter= adapterPolisiyeRuzgari

        binding.viewPager.adapter = ViewPagerAdapter(imageList)
        binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        return binding.root
    }

    private fun addFilm(film: Film, list: MutableList<Film>) {
        list.add(film)
    }

    private fun addToList(image: Int) {
        imageList.add(image)
    }

}