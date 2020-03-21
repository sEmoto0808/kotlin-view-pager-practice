package com.example.viewpagerpractice.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagerpractice.ViewPagerContent1Fragment
import com.example.viewpagerpractice.ViewPagerContent2Fragment
import com.example.viewpagerpractice.ViewPagerContent3Fragment

private const val ITEM_COUNT = 3

/**
 * 3ページ分のコンテンツを表示する`ViewPager`のAdapterクラス。
 */
class PracticeFragmentPagerAdapter(
    fragmentManager: FragmentManager
): FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return when (position % ITEM_COUNT) {
            0 -> ViewPagerContent1Fragment()
            1 -> ViewPagerContent2Fragment()
            2 -> ViewPagerContent3Fragment()
            else -> Fragment()
        }
    }

    override fun getCount(): Int = ITEM_COUNT
}