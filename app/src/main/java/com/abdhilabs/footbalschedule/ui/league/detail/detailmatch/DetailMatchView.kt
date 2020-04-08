package com.abdhilabs.footbalschedule.ui.league.detail.detailmatch

import com.abdhilabs.footbalschedule.base.BaseServiceCallBack
import com.abdhilabs.footbalschedule.model.item.Events
import com.abdhilabs.footbalschedule.model.response.TeamResponse

interface DetailMatchView : BaseServiceCallBack {
    fun showTeamHome(team: TeamResponse.Team?)
    fun showTeamAway(team: TeamResponse.Team)
    fun onDataLoaded(data: List<Events>)
    fun onDataError(msg: String)
    fun onShowLoading()
    fun onHideLoading()
}