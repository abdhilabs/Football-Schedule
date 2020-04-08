package com.abdhilabs.footbalschedule.ui.league.detail.nextmatch

import com.abdhilabs.footbalschedule.base.BaseServiceCallBack
import com.abdhilabs.footbalschedule.model.item.Events

interface NextMatchView : BaseServiceCallBack {
    fun onDataLoaded(data: List<Events>)
    fun onDataError(msg: String)
    fun onShowLoading()
    fun onHideLoading()
}