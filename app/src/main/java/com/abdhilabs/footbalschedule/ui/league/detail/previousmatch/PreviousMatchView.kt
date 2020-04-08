package com.abdhilabs.footbalschedule.ui.league.detail.previousmatch

import com.abdhilabs.footbalschedule.base.BaseServiceCallBack
import com.abdhilabs.footbalschedule.model.item.Events

interface PreviousMatchView : BaseServiceCallBack {
    fun onDataLoaded(data: List<Events>)
    fun onDataError(msg: String)
    fun onShowLoading()
    fun onHideLoading()
}