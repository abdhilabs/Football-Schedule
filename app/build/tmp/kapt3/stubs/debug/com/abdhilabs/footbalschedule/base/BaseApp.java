package com.abdhilabs.footbalschedule.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/abdhilabs/footbalschedule/base/BaseApp;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
public final class BaseApp extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static com.abdhilabs.footbalschedule.db.AppDatabase db;
    public static final com.abdhilabs.footbalschedule.base.BaseApp.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public BaseApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/abdhilabs/footbalschedule/base/BaseApp$Companion;", "", "()V", "db", "Lcom/abdhilabs/footbalschedule/db/AppDatabase;", "getDb", "()Lcom/abdhilabs/footbalschedule/db/AppDatabase;", "setDb", "(Lcom/abdhilabs/footbalschedule/db/AppDatabase;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.abdhilabs.footbalschedule.db.AppDatabase getDb() {
            return null;
        }
        
        public final void setDb(@org.jetbrains.annotations.NotNull()
        com.abdhilabs.footbalschedule.db.AppDatabase p0) {
        }
        
        private Companion() {
            super();
        }
    }
}