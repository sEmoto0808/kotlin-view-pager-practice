package com.example.viewpagerpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.Observable
import androidx.viewpager.widget.ViewPager
import com.example.viewpagerpractice.adapter.PracticeFragmentPagerAdapter
import com.example.viewpagerpractice.adapter.PracticeFragmentStatePagerAdapter
import com.example.viewpagerpractice.databinding.FragmentViewPagerHostBinding

/**
 * `ViewPager`をホストするFragment。
 */
class ViewPagerHostFragment : Fragment() {

    private lateinit var binding: FragmentViewPagerHostBinding

    private var viewPagerType: ViewPagerType? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            viewPagerType = ViewPagerHostFragmentArgs.fromBundle(it).type
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentViewPagerHostBinding.inflate(inflater).apply {

            if (viewPagerType == ViewPagerType.ADDABLE) {
                val pagerAdapter = PracticeFragmentStatePagerAdapter(childFragmentManager)
                viewPagerPractice.adapter = pagerAdapter

                viewPagerPractice.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
                    override fun onPageScrollStateChanged(state: Int) {

                        // 最後のページでスワイプした時
                        if (state == ViewPager.SCROLL_STATE_IDLE &&
                                pagerAdapter.isLastPage(viewPagerPractice.currentItem)) {
                            pagerAdapter.add()
                        }
                    }

                    override fun onPageScrolled(
                        position: Int,
                        positionOffset: Float,
                        positionOffsetPixels: Int
                    ) {}

                    override fun onPageSelected(position: Int) {}
                })
            } else {
                val pagerAdapter = PracticeFragmentPagerAdapter(childFragmentManager)
                viewPagerPractice.adapter = pagerAdapter
            }
        }

        return binding.root
    }


    override fun onDestroyView() {
        binding.viewPagerPractice.adapter = null
        super.onDestroyView()
    }
}
