package com.abdhilabs.footbalschedule.model.item;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\bG\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 Y2\u00020\u0001:\u0001YB\u00e1\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u001aJ\u0010\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0096\u0002\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010KJ\t\u0010L\u001a\u00020MH\u00d6\u0001J\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010QH\u00d6\u0003J\t\u0010R\u001a\u00020MH\u00d6\u0001J\t\u0010S\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020MH\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001cR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001c\u00a8\u0006Z"}, d2 = {"Lcom/abdhilabs/footbalschedule/model/item/Favorite;", "Landroid/os/Parcelable;", "id", "", "idEvent", "", "strEvent", "dateEvent", "idHomeTeam", "idAwayTeam", "strHomeTeam", "strAwayTeam", "intHomeScore", "intAwayScore", "strHomeGoalDetails", "strAwayGoalDetails", "intHomeShots", "intAwayShots", "strHomeLineupGoalkeeper", "strAwayLineupGoalkeeper", "strHomeLineupDefense", "strAwayLineupDefense", "strHomeLineupMidfield", "strAwayLineupMidfield", "strHomeLineupForward", "strAwayLineupForward", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDateEvent", "()Ljava/lang/String;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIdAwayTeam", "getIdEvent", "getIdHomeTeam", "getIntAwayScore", "getIntAwayShots", "getIntHomeScore", "getIntHomeShots", "getStrAwayGoalDetails", "getStrAwayLineupDefense", "getStrAwayLineupForward", "getStrAwayLineupGoalkeeper", "getStrAwayLineupMidfield", "getStrAwayTeam", "getStrEvent", "getStrHomeGoalDetails", "getStrHomeLineupDefense", "getStrHomeLineupForward", "getStrHomeLineupGoalkeeper", "getStrHomeLineupMidfield", "getStrHomeTeam", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/abdhilabs/footbalschedule/model/item/Favorite;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_debug"})
public final class Favorite implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String idEvent = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strEvent = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String dateEvent = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String idHomeTeam = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String idAwayTeam = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strHomeTeam = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strAwayTeam = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String intHomeScore = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String intAwayScore = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strHomeGoalDetails = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strAwayGoalDetails = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String intHomeShots = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String intAwayShots = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strHomeLineupGoalkeeper = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strAwayLineupGoalkeeper = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strHomeLineupDefense = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strAwayLineupDefense = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strHomeLineupMidfield = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strAwayLineupMidfield = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strHomeLineupForward = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strAwayLineupForward = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_FAVORITE = "TABLE_FAVORITE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID = "ID_";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_ID = "MATCH_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_NAME = "MATCH_NAME";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_DATE = "MATCH_DATE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_ID_HOME = "MATCH_ID_HOME";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_HOME_NAME = "MATCH_HOME_NAME";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_HOME_SCORE = "MATCH_HOME_SCORE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_HOME_GOALS = "MATCH_HOME_GOALS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_HOME_SHOTS = "MATCH_HOME_SHOTS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_HOME_GOALKEEPER = "MATCH_HOME_GOALKEEPER";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_HOME_DEFENSE = "MATCH_HOME_DEFENSE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_HOME_MIDFIELD = "MATCH_HOME_MIDFIELD";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_HOME_FORWARD = "MATCH_HOME_FORWARD";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_ID_AWAY = "MATCH_ID_AWAY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_AWAY_NAME = "MATCH_AWAY_NAME";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_AWAY_SCORE = "MATCH_AWAY_SCORE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_AWAY_GOALS = "MATCH_AWAY_GOALS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_AWAY_SHOTS = "MATCH_AWAY_SHOTS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_AWAY_GOALKEEPER = "MATCH_AWAY_GOALKEEPER";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_AWAY_DEFENSE = "MATCH_AWAY_DEFENSE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_AWAY_MIDFIELD = "MATCH_AWAY_MIDFIELD";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MATCH_AWAY_FORWARD = "MATCH_AWAY_FORWARD";
    public static final com.abdhilabs.footbalschedule.model.item.Favorite.Companion Companion = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDateEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdHomeTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdAwayTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrHomeTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAwayTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIntHomeScore() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIntAwayScore() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrHomeGoalDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAwayGoalDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIntHomeShots() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIntAwayShots() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrHomeLineupGoalkeeper() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAwayLineupGoalkeeper() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrHomeLineupDefense() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAwayLineupDefense() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrHomeLineupMidfield() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAwayLineupMidfield() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrHomeLineupForward() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAwayLineupForward() {
        return null;
    }
    
    public Favorite(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.String idEvent, @org.jetbrains.annotations.Nullable()
    java.lang.String strEvent, @org.jetbrains.annotations.Nullable()
    java.lang.String dateEvent, @org.jetbrains.annotations.Nullable()
    java.lang.String idHomeTeam, @org.jetbrains.annotations.Nullable()
    java.lang.String idAwayTeam, @org.jetbrains.annotations.Nullable()
    java.lang.String strHomeTeam, @org.jetbrains.annotations.Nullable()
    java.lang.String strAwayTeam, @org.jetbrains.annotations.Nullable()
    java.lang.String intHomeScore, @org.jetbrains.annotations.Nullable()
    java.lang.String intAwayScore, @org.jetbrains.annotations.Nullable()
    java.lang.String strHomeGoalDetails, @org.jetbrains.annotations.Nullable()
    java.lang.String strAwayGoalDetails, @org.jetbrains.annotations.Nullable()
    java.lang.String intHomeShots, @org.jetbrains.annotations.Nullable()
    java.lang.String intAwayShots, @org.jetbrains.annotations.Nullable()
    java.lang.String strHomeLineupGoalkeeper, @org.jetbrains.annotations.Nullable()
    java.lang.String strAwayLineupGoalkeeper, @org.jetbrains.annotations.Nullable()
    java.lang.String strHomeLineupDefense, @org.jetbrains.annotations.Nullable()
    java.lang.String strAwayLineupDefense, @org.jetbrains.annotations.Nullable()
    java.lang.String strHomeLineupMidfield, @org.jetbrains.annotations.Nullable()
    java.lang.String strAwayLineupMidfield, @org.jetbrains.annotations.Nullable()
    java.lang.String strHomeLineupForward, @org.jetbrains.annotations.Nullable()
    java.lang.String strAwayLineupForward) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.abdhilabs.footbalschedule.model.item.Favorite copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.String idEvent, @org.jetbrains.annotations.Nullable()
    java.lang.String strEvent, @org.jetbrains.annotations.Nullable()
    java.lang.String dateEvent, @org.jetbrains.annotations.Nullable()
    java.lang.String idHomeTeam, @org.jetbrains.annotations.Nullable()
    java.lang.String idAwayTeam, @org.jetbrains.annotations.Nullable()
    java.lang.String strHomeTeam, @org.jetbrains.annotations.Nullable()
    java.lang.String strAwayTeam, @org.jetbrains.annotations.Nullable()
    java.lang.String intHomeScore, @org.jetbrains.annotations.Nullable()
    java.lang.String intAwayScore, @org.jetbrains.annotations.Nullable()
    java.lang.String strHomeGoalDetails, @org.jetbrains.annotations.Nullable()
    java.lang.String strAwayGoalDetails, @org.jetbrains.annotations.Nullable()
    java.lang.String intHomeShots, @org.jetbrains.annotations.Nullable()
    java.lang.String intAwayShots, @org.jetbrains.annotations.Nullable()
    java.lang.String strHomeLineupGoalkeeper, @org.jetbrains.annotations.Nullable()
    java.lang.String strAwayLineupGoalkeeper, @org.jetbrains.annotations.Nullable()
    java.lang.String strHomeLineupDefense, @org.jetbrains.annotations.Nullable()
    java.lang.String strAwayLineupDefense, @org.jetbrains.annotations.Nullable()
    java.lang.String strHomeLineupMidfield, @org.jetbrains.annotations.Nullable()
    java.lang.String strAwayLineupMidfield, @org.jetbrains.annotations.Nullable()
    java.lang.String strHomeLineupForward, @org.jetbrains.annotations.Nullable()
    java.lang.String strAwayLineupForward) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/abdhilabs/footbalschedule/model/item/Favorite$Companion;", "", "()V", "ID", "", "MATCH_AWAY_DEFENSE", "MATCH_AWAY_FORWARD", "MATCH_AWAY_GOALKEEPER", "MATCH_AWAY_GOALS", "MATCH_AWAY_MIDFIELD", "MATCH_AWAY_NAME", "MATCH_AWAY_SCORE", "MATCH_AWAY_SHOTS", "MATCH_DATE", "MATCH_HOME_DEFENSE", "MATCH_HOME_FORWARD", "MATCH_HOME_GOALKEEPER", "MATCH_HOME_GOALS", "MATCH_HOME_MIDFIELD", "MATCH_HOME_NAME", "MATCH_HOME_SCORE", "MATCH_HOME_SHOTS", "MATCH_ID", "MATCH_ID_AWAY", "MATCH_ID_HOME", "MATCH_NAME", "TABLE_FAVORITE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}