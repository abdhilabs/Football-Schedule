package com.abdhilabs.footbalschedule.ui.search.match

import com.abdhilabs.footbalschedule.base.BaseServiceCallBack
import com.abdhilabs.footbalschedule.model.item.Events

interface SearchMatchView : BaseServiceCallBack {
    fun onDataLoaded(data: List<Events>)
    fun onDataError(msg: String)
    fun onShowLoading()
    fun onHideLoading()
}