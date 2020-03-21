package com.example.viewpagerpractice.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.viewpagerpractice.ViewPagerContent1Fragment
import com.example.viewpagerpractice.ViewPagerContent2Fragment
import com.example.viewpagerpractice.ViewPagerContent3Fragment
import com.example.viewpagerpractice.ViewPagerContentFragment

/**
 * スワイプでコンテンツを追加する`ViewPager`のAdapterクラス。
 * `FragmentStatePagerAdapter`の方がメモリの使用量が少ないので、`Fragment`の数が多い場合はこちらを使う。
 */
class PracticeFragmentStatePagerAdapter(
    fragmentManager: FragmentManager
): FragmentStatePagerAdapter(fragmentManager) {

    var itemList = arrayListOf(
        "Content0",
        "Content1",
        "Content2",
        "Content3",
        "Content4",
        "Content5",
        "Content6",
        "Content7",
        "Content8",
        "Content9"
    )

    override fun getItem(position: Int): Fragment {
        return ViewPagerContentFragment.newInstance(itemList[position])
    }

    override fun getCount(): Int = itemList.size

    fun add() {
        val lastIndex = itemList.size
        itemList.add(
            "Content$lastIndex"
        )
        notifyDataSetChanged()
    }

    fun isLastPage(currentIndex: Int): Boolean =
        currentIndex == itemList.size - 1
}