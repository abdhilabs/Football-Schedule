package com.abdhilabs.footbalschedule.model.response

import com.abdhilabs.footbalschedule.model.item.Events
import com.google.gson.annotations.SerializedName

data class SearchResponse(
    @SerializedName("event")
    val event: List<Events>
)
