package com.abdhilabs.footbalschedule.ui.league.detail.detailteam

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.abdhilabs.footbalschedule.R
import com.abdhilabs.footbalschedule.base.BaseApp.Companion.db
import com.abdhilabs.footbalschedule.model.response.TeamResponse
import com.abdhilabs.footbalschedule.utils.DATA_DETAIL_TEAM
import com.abdhilabs.footbalschedule.utils.glideActivity
import kotlinx.android.synthetic.main.activity_detail_team.*

class DetailTeamActivity : AppCompatActivity() {

    private lateinit var team: TeamResponse.Team

    private var menuItem: Menu? = null
    private var isFavorite: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_team)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        team = intent.getParcelableExtra(DATA_DETAIL_TEAM)
        setupView(team)
        favoriteState()
    }

    private fun favoriteState() {
        val fav = db.teamDao().isFavorite(team.idTeam!!)
        if (fav.isNotEmpty()) isFavorite = true
    }

    private fun setupView(team: TeamResponse.Team?) {
        tv_country_detailteam.text = team?.strCountry
        tv_league_detail_team.text = team?.strLeague
        tv_desc_detailteam.text = team?.strStadiumDescription
        tv_team_detail.text = team?.strTeam
        tv_website_detailteam.text = team?.strWebsite
        glideActivity(this, team?.strTeamBanner, iv_banner_detailteam)
        glideActivity(this, team?.strTeamLogo, iv_logo_detailTeam)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.detail_menu, menu)
        menuItem = menu
        setFavorite()
        return super.onCreateOptionsMenu(menu)
    }

    private fun setFavorite() {
        if (isFavorite) {
            menuItem?.getItem(0)?.icon =
                ContextCompat.getDrawable(this, R.drawable.ic_added_to_favorites)
        } else {
            menuItem?.getItem(0)?.icon =
                ContextCompat.getDrawable(this, R.drawable.ic_add_to_favorites)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> {
                onBackPressed()
            }
            R.id.add_to_favorite -> {
                if (isFavorite) {
                    db.teamDao().deleteFromFavorite(team)
                } else {
                    db.teamDao().addToFavorite(team)
                }
                isFavorite = !isFavorite
                setFavorite()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
