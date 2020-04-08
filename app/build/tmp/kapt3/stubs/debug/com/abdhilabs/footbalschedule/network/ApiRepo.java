package com.abdhilabs.footbalschedule.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eJ\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0\n2\u0006\u0010\u0014\u001a\u00020\u000eJ\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0014\u001a\u00020\u000eJ\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u000eJ\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0014\u001a\u00020\u000eJ\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u001a\u001a\u00020\u000eJ\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\n2\u0006\u0010\u001a\u001a\u00020\u000eJ\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000b0\n2\u0006\u0010\u0014\u001a\u00020\u000eJ\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\n2\u0006\u0010\u0014\u001a\u00020\u000eR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001f"}, d2 = {"Lcom/abdhilabs/footbalschedule/network/ApiRepo;", "", "()V", "api", "Lcom/abdhilabs/footbalschedule/network/RestApi;", "getApi", "()Lcom/abdhilabs/footbalschedule/network/RestApi;", "api$delegate", "Lkotlin/Lazy;", "getDetailMatch", "Lio/reactivex/Observable;", "", "Lcom/abdhilabs/footbalschedule/model/item/Events;", "idMatch", "", "getDetailTeamMatch", "Lcom/abdhilabs/footbalschedule/model/response/TeamResponse$Team;", "idTeam", "getLeagueDetail", "Lcom/abdhilabs/footbalschedule/model/response/LeagueResponse$LeagueModel;", "idLeague", "getNextMatch", "getPlayersTeam", "Lcom/abdhilabs/footbalschedule/model/item/Player;", "getPreviousMatch", "getSearchMatch", "query", "getSearchTeam", "getStanding", "Lcom/abdhilabs/footbalschedule/model/item/Standing;", "getTeams", "app_debug"})
public final class ApiRepo {
    private final kotlin.Lazy api$delegate = null;
    
    private final com.abdhilabs.footbalschedule.network.RestApi getApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.abdhilabs.footbalschedule.model.response.LeagueResponse.LeagueModel>> getLeagueDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String idLeague) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.abdhilabs.footbalschedule.model.item.Events>> getNextMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String idLeague) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.abdhilabs.footbalschedule.model.item.Events>> getPreviousMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String idLeague) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.abdhilabs.footbalschedule.model.item.Events>> getDetailMatch(@org.jetbrains.annotations.Nullable()
    java.lang.String idMatch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.abdhilabs.footbalschedule.model.response.TeamResponse.Team>> getDetailTeamMatch(@org.jetbrains.annotations.Nullable()
    java.lang.String idTeam) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.abdhilabs.footbalschedule.model.item.Events>> getSearchMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.abdhilabs.footbalschedule.model.response.TeamResponse.Team>> getSearchTeam(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.abdhilabs.footbalschedule.model.response.TeamResponse.Team>> getTeams(@org.jetbrains.annotations.NotNull()
    java.lang.String idLeague) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.abdhilabs.footbalschedule.model.item.Player>> getPlayersTeam(@org.jetbrains.annotations.NotNull()
    java.lang.String idTeam) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.abdhilabs.footbalschedule.model.item.Standing>> getStanding(@org.jetbrains.annotations.NotNull()
    java.lang.String idLeague) {
        return null;
    }
    
    public ApiRepo() {
        super();
    }
}