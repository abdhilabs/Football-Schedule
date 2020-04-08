package com.abdhilabs.footbalschedule.ui.league.detail.team

import com.abdhilabs.footbalschedule.base.BaseServiceCallBack
import com.abdhilabs.footbalschedule.model.response.TeamResponse

interface TeamsView : BaseServiceCallBack {
    fun onDataLoaded(data: List<TeamResponse.Team>)
    fun onDataError(msg: String)
    fun onShowLoading()
    fun onHideLoading()
}