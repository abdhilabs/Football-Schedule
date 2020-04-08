package com.abdhilabs.footbalschedule.ui.league.detail.detailmatch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&\u00a8\u0006\u0010"}, d2 = {"Lcom/abdhilabs/footbalschedule/ui/league/detail/detailmatch/DetailMatchView;", "Lcom/abdhilabs/footbalschedule/base/BaseServiceCallBack;", "onDataError", "", "msg", "", "onDataLoaded", "data", "", "Lcom/abdhilabs/footbalschedule/model/item/Events;", "onHideLoading", "onShowLoading", "showTeamAway", "team", "Lcom/abdhilabs/footbalschedule/model/response/TeamResponse$Team;", "showTeamHome", "app_debug"})
public abstract interface DetailMatchView extends com.abdhilabs.footbalschedule.base.BaseServiceCallBack {
    
    public abstract void showTeamHome(@org.jetbrains.annotations.Nullable()
    com.abdhilabs.footbalschedule.model.response.TeamResponse.Team team);
    
    public abstract void showTeamAway(@org.jetbrains.annotations.NotNull()
    com.abdhilabs.footbalschedule.model.response.TeamResponse.Team team);
    
    public abstract void onDataLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.abdhilabs.footbalschedule.model.item.Events> data);
    
    public abstract void onDataError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
    
    public abstract void onShowLoading();
    
    public abstract void onHideLoading();
}