package com.abdhilabs.footbalschedule.ui.search.team

import com.abdhilabs.footbalschedule.base.BaseServiceCallBack
import com.abdhilabs.footbalschedule.model.response.TeamResponse

interface SearchTeamView : BaseServiceCallBack {
    fun onDataLoaded(data: List<TeamResponse.Team>)
    fun onDataError(msg: String)
    fun onShowLoading()
    fun onHideLoading()
}