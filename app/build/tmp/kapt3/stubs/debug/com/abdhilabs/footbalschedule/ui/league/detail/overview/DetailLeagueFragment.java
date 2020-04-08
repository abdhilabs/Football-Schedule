package com.abdhilabs.footbalschedule.ui.league.detail.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0003J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\u001a\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/abdhilabs/footbalschedule/ui/league/detail/overview/DetailLeagueFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/abdhilabs/footbalschedule/ui/league/detail/overview/DetailLeagueView;", "()V", "presenter", "Lcom/abdhilabs/footbalschedule/ui/league/detail/overview/DetailLeaguePresenter;", "dataDetail", "", "leagueModel", "Lcom/abdhilabs/footbalschedule/model/response/LeagueResponse$LeagueModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDataError", "msg", "", "onDataLoaded", "data", "", "onDestroy", "onHideLoading", "onShowLoading", "onViewCreated", "view", "app_debug"})
public final class DetailLeagueFragment extends androidx.fragment.app.Fragment implements com.abdhilabs.footbalschedule.ui.league.detail.overview.DetailLeagueView {
    private final com.abdhilabs.footbalschedule.ui.league.detail.overview.DetailLeaguePresenter presenter = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void dataDetail(com.abdhilabs.footbalschedule.model.response.LeagueResponse.LeagueModel leagueModel) {
    }
    
    @java.lang.Override()
    public void onDataLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.abdhilabs.footbalschedule.model.response.LeagueResponse.LeagueModel> data) {
    }
    
    @java.lang.Override()
    public void onDataError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void onShowLoading() {
    }
    
    @java.lang.Override()
    public void onHideLoading() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public DetailLeagueFragment() {
        super();
    }
}