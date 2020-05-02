package com.example.tabviewusingkotlin.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tabviewusingkotlin.Fragments.Fragment_1
import com.example.tabviewusingkotlin.Fragments.Fragment_2
import com.example.tabviewusingkotlin.Fragments.Fragment_3

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return Fragment_1()
            }
            1 -> {
                return Fragment_2()
            }
            2 -> {
                return Fragment_3()
            }
            else -> {
                return Fragment_1()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {

        when (position) {
            0 -> {
                return "One"
            }
            1 -> {
                return "Two"
            }
            2 -> {
                return "Three"
            }

        }
        return super.getPageTitle(position)
    }

    override fun getCount(): Int {
        return 3
    }

}