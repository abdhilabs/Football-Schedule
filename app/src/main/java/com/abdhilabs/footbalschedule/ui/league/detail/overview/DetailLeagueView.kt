package com.abdhilabs.footbalschedule.ui.league.detail.overview

import com.abdhilabs.footbalschedule.base.BaseServiceCallBack
import com.abdhilabs.footbalschedule.model.response.LeagueResponse

interface DetailLeagueView : BaseServiceCallBack {
    fun onDataLoaded(data: List<LeagueResponse.LeagueModel>)
    fun onDataError(msg: String)
    fun onShowLoading()
    fun onHideLoading()
}