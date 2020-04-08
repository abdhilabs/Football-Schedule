package com.abdhilabs.footbalschedule.ui.league.detail.team

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.abdhilabs.footbalschedule.R
import com.abdhilabs.footbalschedule.model.response.TeamResponse
import com.abdhilabs.footbalschedule.network.ApiRepo
import com.abdhilabs.footbalschedule.utils.DATA_ID_DETAIL_LEAGUE
import kotlinx.android.synthetic.main.fragment_teams.*

class TeamsFragment : Fragment(), TeamsView {

    private val presenter =
        TeamsPresenter(
            ApiRepo()
        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        presenter.bindCallBack(this)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_teams, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val idLeague = activity?.intent?.getStringExtra(DATA_ID_DETAIL_LEAGUE)

        presenter.getTeams(idLeague!!)

    }

    override fun onDataLoaded(data: List<TeamResponse.Team>) {
        val adapterTeam = TeamsAdapter(data)
        rv_list_teams.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterTeam
        }
    }

    override fun onDataError(msg: String) {
        Log.e("ERROR", msg)
    }

    override fun onShowLoading() {
        progress_bar_team.visibility = VISIBLE
    }

    override fun onHideLoading() {
        progress_bar_team.visibility = GONE
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.unBind()
    }
}
