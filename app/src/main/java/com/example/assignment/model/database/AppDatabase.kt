package com.example.assignment.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.assignment.model.database.dao.RepoDao
import com.example.assignment.model.database.entity.User

@Database(entities = [User::class], version = AppDatabase.VERSION)
abstract class AppDatabase : RoomDatabase() {
    companion object {
        const val DB_NAME = "repo.db"
        const val VERSION = 1
    }
    abstract fun repoDao(): RepoDao
}

