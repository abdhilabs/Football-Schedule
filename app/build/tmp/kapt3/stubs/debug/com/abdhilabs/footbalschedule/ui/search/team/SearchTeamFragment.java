package com.abdhilabs.footbalschedule.ui.search.team;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0016\u0010\u001b\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\"\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010#\u001a\u00020\u000fH\u0016J\u001a\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/abdhilabs/footbalschedule/ui/search/team/SearchTeamFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/abdhilabs/footbalschedule/ui/search/team/SearchTeamView;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "()V", "adapterSearch", "Lcom/abdhilabs/footbalschedule/ui/league/detail/team/TeamsAdapter;", "listSearches", "", "Lcom/abdhilabs/footbalschedule/model/response/TeamResponse$Team;", "presenter", "Lcom/abdhilabs/footbalschedule/ui/search/team/SearchTeamPresenter;", "strQuery", "", "getSearch", "", "query", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDataError", "msg", "onDataLoaded", "data", "onDestroy", "onHideLoading", "onQueryTextChange", "", "newText", "onQueryTextSubmit", "onShowLoading", "onViewCreated", "view", "app_debug"})
public final class SearchTeamFragment extends androidx.fragment.app.Fragment implements com.abdhilabs.footbalschedule.ui.search.team.SearchTeamView, androidx.appcompat.widget.SearchView.OnQueryTextListener {
    private com.abdhilabs.footbalschedule.ui.league.detail.team.TeamsAdapter adapterSearch;
    private java.lang.String strQuery;
    private final java.util.List<com.abdhilabs.footbalschedule.model.response.TeamResponse.Team> listSearches = null;
    private final com.abdhilabs.footbalschedule.ui.search.team.SearchTeamPresenter presenter = null;
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
    
    @java.lang.Override()
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return false;
    }
    
    private final void getSearch(java.lang.String query) {
    }
    
    @java.lang.Override()
    public boolean onQueryTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.String newText) {
        return false;
    }
    
    @java.lang.Override()
    public void onDataLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.abdhilabs.footbalschedule.model.response.TeamResponse.Team> data) {
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
    
    public SearchTeamFragment() {
        super();
    }
}