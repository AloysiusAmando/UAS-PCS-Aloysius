package com.app.githubcarikan.api

import com.app.githubcarikan.data.model.DetailUserResponse
import com.app.githubcarikan.data.model.User
import com.app.githubcarikan.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token a48ec62b5dc1db2d169ac1d79c457812cdc0083c")
    fun getSearchUsers(
        @Query("q") query: String
    ) : Call<UserResponse>

    @GET("users/{username}")
    @Headers ("Authorization: token a48ec62b5dc1db2d169ac1d79c457812cdc0083c")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token a48ec62b5dc1db2d169ac1d79c457812cdc0083c")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token a48ec62b5dc1db2d169ac1d79c457812cdc0083c")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}