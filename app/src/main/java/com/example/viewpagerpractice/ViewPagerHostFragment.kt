package com.example.viewpagerpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagerpractice.databinding.FragmentViewPagerHostBinding

/**
 * `ViewPager`をホストするFragment。
 */
class ViewPagerHostFragment : Fragment() {

    private lateinit var binding: FragmentViewPagerHostBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewPagerHostBinding.inflate(inflater)
        return binding.root
    }


}
