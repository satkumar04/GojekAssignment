package com.example.assignment.model.database.entity


import androidx.room.Entity
import androidx.room.PrimaryKey
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity
data class User(
    @field:PrimaryKey(autoGenerate = true)
    @field:SerializedName("id")
    var id: Int,
    @field:SerializedName("author")
    var author: String?,

    @field:SerializedName("name")
    var name: String?,

    @field:SerializedName("avatar")
    var avatar: String?,

    @field:SerializedName("url")
    var url: String,

    @field:SerializedName("description")
    var description: String?,

    @field:SerializedName("language")
    var language: String?,


    @field:SerializedName("languageColor")
    var languageColor: String?,

    @field:SerializedName("stars")
    var stars: Int,

    @field:SerializedName("forks")
    var forks: Int,

    @field:SerializedName("currentPeriodStars")
    var currentPeriodStars: Int
    ) : Parcelable



