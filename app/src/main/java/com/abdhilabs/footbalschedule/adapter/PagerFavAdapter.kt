package com.abdhilabs.footbalschedule.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.abdhilabs.footbalschedule.ui.favorite.match.FavMatchFragment
import com.abdhilabs.footbalschedule.ui.favorite.team.FavTeamFragment

class PagerFavAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FavMatchFragment()
            else -> FavTeamFragment()
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