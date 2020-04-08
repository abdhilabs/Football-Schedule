package com.abdhilabs.footbalschedule.ui.league.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.abdhilabs.footbalschedule.R
import com.abdhilabs.footbalschedule.adapter.PagerLeagueAdapter
import kotlinx.android.synthetic.main.activity_detail_league.*

class DetailLeagueActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_league)

        val fragmentAdapter = PagerLeagueAdapter(supportFragmentManager)
        view_pager_league.adapter = fragmentAdapter

        tab_layout_league.setupWithViewPager(view_pager_league)

    }

}
