package com.example.viewpagerpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagerpractice.databinding.FragmentViewPagerContent2Binding

/**
 * Content2
 */
class ViewPagerContent2Fragment : Fragment() {

    private lateinit var binding: FragmentViewPagerContent2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewPagerContent2Binding.inflate(inflater)
        return binding.root
    }


}
