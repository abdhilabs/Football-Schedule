package com.abdhilabs.footbalschedule.network

import com.abdhilabs.footbalschedule.model.item.Events
import com.abdhilabs.footbalschedule.model.item.Player
import com.abdhilabs.footbalschedule.model.item.Standing
import com.abdhilabs.footbalschedule.model.response.LeagueResponse
import com.abdhilabs.footbalschedule.model.response.TeamResponse
import io.reactivex.Observable

class ApiRepo {

    private val api by lazy {
        ApiRetrofit.createService(RestApi::class.java)
    }

    fun getLeagueDetail(idLeague: String): Observable<List<LeagueResponse.LeagueModel>> {
        return api.getDetailLeague(idLeague)
            .map { it.dataLeague }
    }

    fun getNextMatch(idLeague: String): Observable<List<Events>> {
        return api.getNextMatch(idLeague = idLeague)
            .map { it.events }
    }

    fun getPreviousMatch(idLeague: String): Observable<List<Events>> {
        return api.getPreviousMatch(idLeague = idLeague)
            .map { it.events }
    }

    fun getDetailMatch(idMatch: String?): Observable<List<Events>> {
        return api.getMatchDetail(idMatch)
            .map { it.events }
    }

    fun getDetailTeamMatch(idTeam: String?): Observable<List<TeamResponse.Team>> {
        return api.getDetailTeamMatch(idTeam = idTeam)
            .map { it.teams }
    }

    fun getSearchMatch(query: String): Observable<List<Events>> {
        return api.getSearchMatch(query)
            .map { it.event.filter { event -> event.strSport.equals("Soccer") } }
    }

    fun getSearchTeam(query: String): Observable<List<TeamResponse.Team>> {
        return api.getSearchTeam(query)
            .map { it.teams }
    }

    fun getTeams(idLeague: String): Observable<List<TeamResponse.Team>> {
        return api.getTeams(idLeague)
            .map { it.teams }
    }

    fun getPlayersTeam(idTeam: String): Observable<List<Player>> {
        return api.getPlayersTeam(idTeam)
            .map { it.player }
    }

    fun getStanding(idLeague: String): Observable<List<Standing>> {
        return api.getStanding(idLeague)
            .map { it.standing }
    }

}