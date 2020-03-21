package com.example.viewpagerpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagerpractice.databinding.FragmentViewPagerContent3Binding

/**
 * Content3
 */
class ViewPagerContent3Fragment : Fragment() {

    private lateinit var binding: FragmentViewPagerContent3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewPagerContent3Binding.inflate(inflater)
        return binding.root
    }


}
