package com.abdhilabs.footbalschedule.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/abdhilabs/footbalschedule/db/TeamDao;", "", "addToFavorite", "", "team", "Lcom/abdhilabs/footbalschedule/model/response/TeamResponse$Team;", "deleteFromFavorite", "getAll", "", "isFavorite", "id", "", "app_debug"})
public abstract interface TeamDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM team")
    public abstract java.util.List<com.abdhilabs.footbalschedule.model.response.TeamResponse.Team> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM team WHERE id_team=:id")
    public abstract java.util.List<com.abdhilabs.footbalschedule.model.response.TeamResponse.Team> isFavorite(int id);
    
    @androidx.room.Insert()
    public abstract void addToFavorite(@org.jetbrains.annotations.NotNull()
    com.abdhilabs.footbalschedule.model.response.TeamResponse.Team team);
    
    @androidx.room.Delete()
    public abstract void deleteFromFavorite(@org.jetbrains.annotations.NotNull()
    com.abdhilabs.footbalschedule.model.response.TeamResponse.Team team);
}