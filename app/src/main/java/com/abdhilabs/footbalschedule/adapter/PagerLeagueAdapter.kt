package com.abdhilabs.footbalschedule.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.abdhilabs.footbalschedule.ui.league.detail.nextmatch.NextMatchFragment
import com.abdhilabs.footbalschedule.ui.league.detail.overview.DetailLeagueFragment
import com.abdhilabs.footbalschedule.ui.league.detail.previousmatch.PreviousMatchFragment
import com.abdhilabs.footbalschedule.ui.league.detail.standing.StandingFragment
import com.abdhilabs.footbalschedule.ui.league.detail.team.TeamsFragment

class PagerLeagueAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> DetailLeagueFragment()
            1 -> NextMatchFragment()
            2 -> PreviousMatchFragment()
            3 -> TeamsFragment()
            else -> StandingFragment()
        }
    }

    override fun getCount(): Int = 5

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Overview"
            1 -> "Next Match"
            2 -> "Previous Match"
            3 -> "Teams"
            else -> "Standing"
        }
    }
}