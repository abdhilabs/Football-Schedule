package com.abdhilabs.footbalschedule.ui.league.detail.detailmatch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u001a\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011J \u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0003J\u0016\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/abdhilabs/footbalschedule/ui/league/detail/detailmatch/DetailMatchPresenter;", "Lcom/abdhilabs/footbalschedule/base/BasePresenter;", "Lcom/abdhilabs/footbalschedule/ui/league/detail/detailmatch/DetailMatchView;", "repo", "Lcom/abdhilabs/footbalschedule/network/ApiRepo;", "backgroundScheduller", "Lio/reactivex/Scheduler;", "mainScheduler", "(Lcom/abdhilabs/footbalschedule/network/ApiRepo;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "addToFavorite", "", "ctx", "Landroid/content/Context;", "data", "Lcom/abdhilabs/footbalschedule/model/item/Events;", "getDetailMatch", "idMatch", "", "getDetailTeam", "idTeamHome", "idTeamAway", "getTeams", "removeFromFavorite", "id", "app_debug"})
public final class DetailMatchPresenter extends com.abdhilabs.footbalschedule.base.BasePresenter<com.abdhilabs.footbalschedule.ui.league.detail.detailmatch.DetailMatchView> {
    private final com.abdhilabs.footbalschedule.network.ApiRepo repo = null;
    private final io.reactivex.Scheduler backgroundScheduller = null;
    private final io.reactivex.Scheduler mainScheduler = null;
    
    public final void getDetailMatch(@org.jetbrains.annotations.Nullable()
    java.lang.String idMatch) {
    }
    
    public final void getDetailTeam(@org.jetbrains.annotations.Nullable()
    java.lang.String idTeamHome, @org.jetbrains.annotations.Nullable()
    java.lang.String idTeamAway) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void getTeams(java.lang.String idTeamHome, java.lang.String idTeamAway) {
    }
    
    public final void addToFavorite(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    com.abdhilabs.footbalschedule.model.item.Events data) {
    }
    
    public final void removeFromFavorite(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public DetailMatchPresenter(@org.jetbrains.annotations.NotNull()
    com.abdhilabs.footbalschedule.network.ApiRepo repo, @org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler backgroundScheduller, @org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler mainScheduler) {
        super();
    }
}