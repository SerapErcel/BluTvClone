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
import com.serapercel.blutvclone.ui.adapter.IzlemeyeDevamEtAdapter


class KesfetFragment : Fragment() {
    private lateinit var binding: FragmentKesfetBinding
    private var imageList = mutableListOf<Int>()
    private var filmList = mutableListOf<Film>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentKesfetBinding.inflate(inflater, container, false)
        addToList(R.drawable.gri_degil_siyah)
        addToList(R.drawable.gri_degil_siyah)
        addToList(R.drawable.gri_degil_siyah)

        val film = Film("Six Feet Under", R.drawable.six_feet_under, "S1 B2 - 59dk")
        val film1 = Film( "Börü", R.drawable.boru, "S1 B2 - 59dk")
        val film2 = Film( "Börü", R.drawable.boru, "S1 B2 - 59dk")

        addFilm(film)
        addFilm(film1)
        addFilm(film2)


        binding.izlemeyeDevamEtRV.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val adapter = IzlemeyeDevamEtAdapter(requireContext(),filmList)
        binding.izlemeyeDevamEtRV.adapter= adapter

        binding.viewPager.adapter = ViewPagerAdapter(imageList)
        binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        return binding.root
    }

    private fun addFilm(film: Film) {
        filmList.add(film)
    }

    private fun addToList(image: Int) {
        imageList.add(image)
    }

}