package com.abdhilabs.footbalschedule.model.response

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

data class TeamResponse(
    @SerializedName("teams")
    val teams: List<Team>
) {
    @Entity
    @Parcelize
    data class Team(
        @SerializedName("idLeague")
        val idLeague: String?,
        @SerializedName("idSoccerXML")
        val idSoccerXML: String?,
        @PrimaryKey
        @ColumnInfo(name = "id_team")
        @SerializedName("idTeam")
        val idTeam: Int?,
        @SerializedName("intFormedYear")
        val intFormedYear: String?,
        @SerializedName("intLoved")
        val intLoved: String?,
        @SerializedName("intStadiumCapacity")
        val intStadiumCapacity: String?,
        @SerializedName("strAlternate")
        val strAlternate: String?,
        @ColumnInfo(name = "country")
        @SerializedName("strCountry")
        val strCountry: String?,
        @SerializedName("strDescriptionCN")
        val strDescriptionCN: String?,
        @SerializedName("strDescriptionDE")
        val strDescriptionDE: String?,
        @SerializedName("strDescriptionEN")
        val strDescriptionEN: String?,
        @SerializedName("strDescriptionES")
        val strDescriptionES: String?,
        @SerializedName("strDescriptionFR")
        val strDescriptionFR: String?,
        @SerializedName("strDescriptionHU")
        val strDescriptionHU: String?,
        @SerializedName("strDescriptionIL")
        val strDescriptionIL: String?,
        @SerializedName("strDescriptionIT")
        val strDescriptionIT: String?,
        @SerializedName("strDescriptionJP")
        val strDescriptionJP: String?,
        @SerializedName("strDescriptionNL")
        val strDescriptionNL: String?,
        @SerializedName("strDescriptionNO")
        val strDescriptionNO: String?,
        @SerializedName("strDescriptionPL")
        val strDescriptionPL: String?,
        @SerializedName("strDescriptionPT")
        val strDescriptionPT: String?,
        @SerializedName("strDescriptionRU")
        val strDescriptionRU: String?,
        @SerializedName("strDescriptionSE")
        val strDescriptionSE: String?,
        @SerializedName("strDivision")
        val strDivision: String?,
        @SerializedName("strFacebook")
        val strFacebook: String?,
        @SerializedName("strGender")
        val strGender: String?,
        @SerializedName("strInstagram")
        val strInstagram: String?,
        @SerializedName("strKeywords")
        val strKeywords: String?,
        @ColumnInfo(name = "league")
        @SerializedName("strLeague")
        val strLeague: String?,
        @SerializedName("strLocked")
        val strLocked: String?,
        @SerializedName("strManager")
        val strManager: String?,
        @SerializedName("strSport")
        val strSport: String?,
        @SerializedName("strStadium")
        val strStadium: String?,
        @ColumnInfo(name = "stadiumDescription")
        @SerializedName("strStadiumDescription")
        val strStadiumDescription: String?,
        @SerializedName("strStadiumLocation")
        val strStadiumLocation: String?,
        @SerializedName("strStadiumThumb")
        val strStadiumThumb: String?,
        @ColumnInfo(name = "team")
        @SerializedName("strTeam")
        val strTeam: String?,
        @SerializedName("strTeamBadge")
        val strTeamBadge: String?,
        @ColumnInfo(name = "teamBanner")
        @SerializedName("strTeamBanner")
        val strTeamBanner: String?,
        @SerializedName("strTeamFanart1")
        val strTeamFanart1: String?,
        @SerializedName("strTeamFanart2")
        val strTeamFanart2: String?,
        @SerializedName("strTeamFanart3")
        val strTeamFanart3: String?,
        @SerializedName("strTeamFanart4")
        val strTeamFanart4: String?,
        @SerializedName("strTeamJersey")
        val strTeamJersey: String?,
        @ColumnInfo(name = "teamLogo")
        @SerializedName("strTeamLogo")
        val strTeamLogo: String?,
        @SerializedName("strTeamShort")
        val strTeamShort: String?,
        @SerializedName("strTwitter")
        val strTwitter: String?,
        @ColumnInfo(name = "website")
        @SerializedName("strWebsite")
        val strWebsite: String?,
        @SerializedName("strYoutube")
        val strYoutube: String?
    ) : Parcelable
}