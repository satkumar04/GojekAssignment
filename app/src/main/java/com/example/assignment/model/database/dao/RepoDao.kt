package com.example.assignment.model.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

import com.example.assignment.model.database.entity.User

@Dao
interface RepoDao {
    @get:Query("SELECT * FROM user")
    val all: MutableList<User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(repoDetails: MutableList<User>)

}