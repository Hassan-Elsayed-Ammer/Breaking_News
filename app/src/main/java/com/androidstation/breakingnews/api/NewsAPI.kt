package com.androidstation.breakingnews.api


import com.androidstation.breakingnews.model.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country") countryCode: String = "eg",

        @Query("page")  pageNumber: Int = 1,

        @Query("apiKey") apiKey: String = API_KEY

    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q") query: String,

        @Query("page")  pageNumber: Int = 1,

        @Query("apiKey") apiKey: String = API_KEY
    ): Response<NewsResponse>
}