package com.abdhilabs.footbalschedule.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/abdhilabs/footbalschedule/ui/search/SearchMatchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/abdhilabs/footbalschedule/ui/search/SearchMatchAdapter$ViewHolder;", "listSearches", "", "Lcom/abdhilabs/footbalschedule/model/item/Events;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class SearchMatchAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.abdhilabs.footbalschedule.ui.search.SearchMatchAdapter.ViewHolder> {
    private final java.util.List<com.abdhilabs.footbalschedule.model.item.Events> listSearches = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.abdhilabs.footbalschedule.ui.search.SearchMatchAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.abdhilabs.footbalschedule.ui.search.SearchMatchAdapter.ViewHolder holder, int position) {
    }
    
    public SearchMatchAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.abdhilabs.footbalschedule.model.item.Events> listSearches) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/abdhilabs/footbalschedule/ui/search/SearchMatchAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "containerView", "getContainerView", "()Landroid/view/View;", "tvAwayTeam", "Landroid/widget/TextView;", "tvDate", "tvHomeTeam", "tvScoreAwayTeam", "tvScoreHomeTeam", "bindItem", "", "event", "Lcom/abdhilabs/footbalschedule/model/item/Events;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
        private final android.widget.TextView tvDate = null;
        private final android.widget.TextView tvHomeTeam = null;
        private final android.widget.TextView tvAwayTeam = null;
        private final android.widget.TextView tvScoreHomeTeam = null;
        private final android.widget.TextView tvScoreAwayTeam = null;
        private java.util.HashMap _$_findViewCache;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public android.view.View getContainerView() {
            return null;
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        com.abdhilabs.footbalschedule.model.item.Events event) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}