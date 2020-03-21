package com.example.viewpagerpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.viewpagerpractice.databinding.FragmentMainBinding

/**
 * 起動画面のFragment。
 */
class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater).apply {

            startButton.setOnClickListener {
                val action =
                    MainFragmentDirections.actionMainToViewPagerHost(
                        ViewPagerType.FIXED
                    )
                findNavController().navigate(action)
            }

            startButtonAddable.setOnClickListener {
                val action =
                    MainFragmentDirections.actionMainToViewPagerHost(
                        ViewPagerType.ADDABLE
                    )
                findNavController().navigate(action)
            }
        }
        return binding.root
    }


}
