package com.abdhilabs.footbalschedule.model.response

import com.abdhilabs.footbalschedule.model.item.Player
import com.google.gson.annotations.SerializedName

data class PlayersResponse(
    @SerializedName("player")
    val player: List<Player>
)