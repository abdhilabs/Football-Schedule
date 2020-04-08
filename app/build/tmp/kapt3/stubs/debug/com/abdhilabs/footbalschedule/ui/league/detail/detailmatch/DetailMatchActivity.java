package com.abdhilabs.footbalschedule.ui.league.detail.detailmatch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0016\u0010\u0019\u001a\u00020\u00112\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0014J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0011H\u0016J\b\u0010!\u001a\u00020\u0011H\u0002J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0007H\u0002J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010\'\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/abdhilabs/footbalschedule/ui/league/detail/detailmatch/DetailMatchActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/abdhilabs/footbalschedule/ui/league/detail/detailmatch/DetailMatchView;", "()V", "data", "Lcom/abdhilabs/footbalschedule/model/item/Events;", "dataFav", "Lcom/abdhilabs/footbalschedule/model/item/Favorite;", "id", "", "isFavorite", "", "menuItem", "Landroid/view/Menu;", "presenter", "Lcom/abdhilabs/footbalschedule/ui/league/detail/detailmatch/DetailMatchPresenter;", "favoriteState", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "onDataError", "msg", "onDataLoaded", "", "onDestroy", "onHideLoading", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onShowLoading", "setFavorite", "setupView", "setupViewFav", "showTeamAway", "team", "Lcom/abdhilabs/footbalschedule/model/response/TeamResponse$Team;", "showTeamHome", "app_debug"})
public final class DetailMatchActivity extends androidx.appcompat.app.AppCompatActivity implements com.abdhilabs.footbalschedule.ui.league.detail.detailmatch.DetailMatchView {
    private final com.abdhilabs.footbalschedule.ui.league.detail.detailmatch.DetailMatchPresenter presenter = null;
    private android.view.Menu menuItem;
    private boolean isFavorite;
    private com.abdhilabs.footbalschedule.model.item.Events data;
    private com.abdhilabs.footbalschedule.model.item.Favorite dataFav;
    private java.lang.String id;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void favoriteState() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void setFavorite() {
    }
    
    private final void setupView(com.abdhilabs.footbalschedule.model.item.Events data) {
    }
    
    private final void setupViewFav(com.abdhilabs.footbalschedule.model.item.Favorite data) {
    }
    
    @java.lang.Override()
    public void onShowLoading() {
    }
    
    @java.lang.Override()
    public void onHideLoading() {
    }
    
    @java.lang.Override()
    public void showTeamHome(@org.jetbrains.annotations.Nullable()
    com.abdhilabs.footbalschedule.model.response.TeamResponse.Team team) {
    }
    
    @java.lang.Override()
    public void showTeamAway(@org.jetbrains.annotations.NotNull()
    com.abdhilabs.footbalschedule.model.response.TeamResponse.Team team) {
    }
    
    @java.lang.Override()
    public void onDataLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.abdhilabs.footbalschedule.model.item.Events> data) {
    }
    
    @java.lang.Override()
    public void onDataError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public DetailMatchActivity() {
        super();
    }
}