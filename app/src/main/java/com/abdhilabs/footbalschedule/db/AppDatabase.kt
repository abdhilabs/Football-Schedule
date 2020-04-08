package com.abdhilabs.footbalschedule.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.abdhilabs.footbalschedule.model.response.TeamResponse

@Database(entities = [TeamResponse.Team::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun teamDao(): TeamDao
}