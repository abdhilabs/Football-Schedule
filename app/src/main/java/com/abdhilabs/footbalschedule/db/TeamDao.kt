package com.abdhilabs.footbalschedule.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.abdhilabs.footbalschedule.model.response.TeamResponse

@Dao
interface TeamDao {

    @Query("SELECT * FROM team")
    fun getAll(): List<TeamResponse.Team>

    @Query("SELECT * FROM team WHERE id_team=:id")
    fun isFavorite(id: Int): List<TeamResponse.Team>

    @Insert
    fun addToFavorite(team: TeamResponse.Team)

    @Delete
    fun deleteFromFavorite(team: TeamResponse.Team)
}