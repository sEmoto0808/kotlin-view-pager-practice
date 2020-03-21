package com.example.viewpagerpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagerpractice.databinding.FragmentViewPagerContent1Binding
import com.example.viewpagerpractice.databinding.FragmentViewPagerHostBinding

/**
 * Content1。
 */
class ViewPagerContent1Fragment : Fragment() {

    private lateinit var binding: FragmentViewPagerContent1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewPagerContent1Binding.inflate(inflater)
        return binding.root
    }


}
