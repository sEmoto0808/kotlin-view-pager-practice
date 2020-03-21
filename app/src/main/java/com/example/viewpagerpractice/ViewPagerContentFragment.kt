package com.example.viewpagerpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagerpractice.databinding.FragmentViewPagerContentBinding

/**
 * Content
 */
class ViewPagerContentFragment : Fragment() {

    private lateinit var binding: FragmentViewPagerContentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentViewPagerContentBinding.inflate(inflater).apply {
            practiceText.text = arguments?.getString(EXTRA_PRACTICE_TEXT)
        }

        return binding.root
    }


    companion object {
        private const val EXTRA_PRACTICE_TEXT = "practiceText"

        fun newInstance(text: String): ViewPagerContentFragment {

            val bundle = Bundle().apply {
                putString(EXTRA_PRACTICE_TEXT, text)
            }

            return ViewPagerContentFragment().apply {
                arguments = bundle
            }
        }
    }
}
