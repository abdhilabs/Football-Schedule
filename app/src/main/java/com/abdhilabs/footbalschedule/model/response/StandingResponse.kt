package com.abdhilabs.footbalschedule.model.response

import com.abdhilabs.footbalschedule.model.item.Standing
import com.google.gson.annotations.SerializedName

data class StandingResponse(
    @SerializedName("table")
    val standing: List<Standing>
)