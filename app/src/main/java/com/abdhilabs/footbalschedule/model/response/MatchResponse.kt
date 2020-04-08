package com.abdhilabs.footbalschedule.model.response

import com.abdhilabs.footbalschedule.model.item.Events
import com.google.gson.annotations.SerializedName

data class MatchResponse(

    @SerializedName("events")
    val events: List<Events>? = null
)