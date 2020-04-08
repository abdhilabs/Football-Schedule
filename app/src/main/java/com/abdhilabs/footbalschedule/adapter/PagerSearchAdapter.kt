package com.abdhilabs.footbalschedule.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.abdhilabs.footbalschedule.ui.search.match.SearchMatchFragment
import com.abdhilabs.footbalschedule.ui.search.team.SearchTeamFragment

class PagerSearchAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> SearchMatchFragment()
            else -> SearchTeamFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Match"
            else -> "Team"
        }
    }
}