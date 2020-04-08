package com.abdhilabs.footbalschedule.network

import com.abdhilabs.footbalschedule.model.response.*
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface RestApi {

    @GET("api/v1/json/1/lookupleague.php")
    fun getDetailLeague(@Query("id") idLeague: String?): Observable<LeagueResponse>

    @GET("api/v1/json/1/eventsnextleague.php")
    fun getNextMatch(@Query("id") idLeague: String?): Observable<MatchResponse>

    @GET("api/v1/json/1/eventspastleague.php")
    fun getPreviousMatch(@Query("id") idLeague: String?): Observable<MatchResponse>

    @GET("api/v1/json/1/lookupevent.php")
    fun getMatchDetail(@Query("id") matchId: String?): Observable<MatchResponse>

    @GET("api/v1/json/1/searchevents.php")
    fun getSearchMatch(@Query("e") query: String?): Observable<SearchResponse>

    @GET("api/v1/json/1/lookupteam.php")
    fun getDetailTeamMatch(@Query("id") idTeam: String?): Observable<TeamResponse>

    @GET("api/v1/json/1/searchteams.php")
    fun getSearchTeam(@Query("t") query: String?): Observable<TeamResponse>

    @GET("api/v1/json/1/lookup_all_teams.php")
    fun getTeams(@Query("id") idLeague: String?): Observable<TeamResponse>

    @GET("api/v1/json/1/lookup_all_players.php")
    fun getPlayersTeam(@Query("id") idTeam: String?): Observable<PlayersResponse>

    @GET("api/v1/json/1/lookuptable.php?")
    fun getStanding(@Query("l") idLeague: String?): Observable<StandingResponse>
}