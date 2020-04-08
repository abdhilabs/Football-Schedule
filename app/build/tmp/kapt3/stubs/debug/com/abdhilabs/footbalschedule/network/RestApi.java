package com.abdhilabs.footbalschedule.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006H\'J\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0006H\'J\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006H\'J\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\'J\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\'J\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\u0018"}, d2 = {"Lcom/abdhilabs/footbalschedule/network/RestApi;", "", "getDetailLeague", "Lio/reactivex/Observable;", "Lcom/abdhilabs/footbalschedule/model/response/LeagueResponse;", "idLeague", "", "getDetailTeamMatch", "Lcom/abdhilabs/footbalschedule/model/response/TeamResponse;", "idTeam", "getMatchDetail", "Lcom/abdhilabs/footbalschedule/model/response/MatchResponse;", "matchId", "getNextMatch", "getPlayersTeam", "Lcom/abdhilabs/footbalschedule/model/response/PlayersResponse;", "getPreviousMatch", "getSearchMatch", "Lcom/abdhilabs/footbalschedule/model/response/SearchResponse;", "query", "getSearchTeam", "getStanding", "Lcom/abdhilabs/footbalschedule/model/response/StandingResponse;", "getTeams", "app_debug"})
public abstract interface RestApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v1/json/1/lookupleague.php")
    public abstract io.reactivex.Observable<com.abdhilabs.footbalschedule.model.response.LeagueResponse> getDetailLeague(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "id")
    java.lang.String idLeague);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v1/json/1/eventsnextleague.php")
    public abstract io.reactivex.Observable<com.abdhilabs.footbalschedule.model.response.MatchResponse> getNextMatch(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "id")
    java.lang.String idLeague);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v1/json/1/eventspastleague.php")
    public abstract io.reactivex.Observable<com.abdhilabs.footbalschedule.model.response.MatchResponse> getPreviousMatch(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "id")
    java.lang.String idLeague);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v1/json/1/lookupevent.php")
    public abstract io.reactivex.Observable<com.abdhilabs.footbalschedule.model.response.MatchResponse> getMatchDetail(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "id")
    java.lang.String matchId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v1/json/1/searchevents.php")
    public abstract io.reactivex.Observable<com.abdhilabs.footbalschedule.model.response.SearchResponse> getSearchMatch(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "e")
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v1/json/1/lookupteam.php")
    public abstract io.reactivex.Observable<com.abdhilabs.footbalschedule.model.response.TeamResponse> getDetailTeamMatch(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "id")
    java.lang.String idTeam);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v1/json/1/searchteams.php")
    public abstract io.reactivex.Observable<com.abdhilabs.footbalschedule.model.response.TeamResponse> getSearchTeam(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "t")
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v1/json/1/lookup_all_teams.php")
    public abstract io.reactivex.Observable<com.abdhilabs.footbalschedule.model.response.TeamResponse> getTeams(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "id")
    java.lang.String idLeague);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v1/json/1/lookup_all_players.php")
    public abstract io.reactivex.Observable<com.abdhilabs.footbalschedule.model.response.PlayersResponse> getPlayersTeam(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "id")
    java.lang.String idTeam);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v1/json/1/lookuptable.php?")
    public abstract io.reactivex.Observable<com.abdhilabs.footbalschedule.model.response.StandingResponse> getStanding(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "l")
    java.lang.String idLeague);
}