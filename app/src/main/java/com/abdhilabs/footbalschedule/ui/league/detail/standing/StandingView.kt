package com.abdhilabs.footbalschedule.ui.league.detail.standing

import com.abdhilabs.footbalschedule.base.BaseServiceCallBack
import com.abdhilabs.footbalschedule.model.item.Standing

interface StandingView : BaseServiceCallBack {
    fun onDataLoaded(data: List<Standing>)
    fun onDataError(msg: String)
}