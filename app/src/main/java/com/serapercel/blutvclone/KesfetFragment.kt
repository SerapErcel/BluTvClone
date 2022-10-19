package com.serapercel.blutvclone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.serapercel.blutvclone.databinding.FragmentKesfetBinding


class KesfetFragment : Fragment() {
    private lateinit var binding: FragmentKesfetBinding
    private var imageList  = mutableListOf<Int>()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    binding = FragmentKesfetBinding.inflate(inflater, container, false)
        addToList(R.drawable.gri_degil_siyah)
        addToList(R.drawable.gri_degil_siyah)
        addToList(R.drawable.gri_degil_siyah)

        binding.viewPager.adapter= ViewPagerAdapter(imageList)
        binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        return binding.root
    }

    private fun addToList(image:Int){
        imageList.add(image)
    }

}