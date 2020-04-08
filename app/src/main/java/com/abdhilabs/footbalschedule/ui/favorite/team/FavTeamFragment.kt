package com.abdhilabs.footbalschedule.ui.favorite.team


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.abdhilabs.footbalschedule.R
import com.abdhilabs.footbalschedule.base.BaseApp.Companion.db
import com.abdhilabs.footbalschedule.model.response.TeamResponse
import com.abdhilabs.footbalschedule.ui.league.detail.team.TeamsAdapter
import kotlinx.android.synthetic.main.fragment_fav_team.*

class FavTeamFragment : Fragment() {

    private val listTeam: MutableList<TeamResponse.Team> = mutableListOf()
    private lateinit var adapterTeam: TeamsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fav_team, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showList()
    }

    private fun showList() {
        listTeam.clear()
        listTeam.addAll(db.teamDao().getAll())
        adapterTeam = TeamsAdapter(listTeam)
        rv_fav_team.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterTeam
        }
    }

    override fun onResume() {
        super.onResume()
        showList()
    }

}
