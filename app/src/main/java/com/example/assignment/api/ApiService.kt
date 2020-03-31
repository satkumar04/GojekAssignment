package com.example.assignment.api

import com.example.assignment.model.database.entity.User
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    /**
     * Get the list of the pots from the API
     */
    @GET("/repositories")
    fun getRepo(@Query("spoken_language_code") param1:String ): Single<MutableList<User>>
}
