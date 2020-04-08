package com.abdhilabs.footbalschedule.base

import android.app.Application
import androidx.room.Room
import com.abdhilabs.footbalschedule.db.AppDatabase

class BaseApp : Application() {

    companion object {
        lateinit var db: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()

        db = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "FAVORITE")
            .allowMainThreadQueries().build()
    }
}