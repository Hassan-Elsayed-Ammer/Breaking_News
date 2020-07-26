package com.androidstation.breakingnews.repository


import com.androidstation.api.RetrofitInstance
import com.androidstation.breakingnews.db.ArticleDatabase
import com.androidstation.breakingnews.model.Article


/* Repository class is a layer between data source and Views -to get th data from local data base
or remote data sources
this will be take a Val instance from Article Data base As An Argument
 */
class NewsRepository (
        val db: ArticleDatabase
) {

    //fun to get breaking news from api its has to parameters country code and page number
    suspend fun getBreakingNews(countyCode: String, pageNumber: Int) =
            RetrofitInstance.api.getBreakingNews(countyCode, pageNumber )

    //Search in Api
    suspend fun searchNews(searchQuery: String , pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    //Upsert function to insert or upData articles
    suspend fun upSert(article: Article) = db.getArticleDao().upSert(article)

    //getSavedNews function To Save News In data Base
    fun getSavedNews() = db.getArticleDao().getAllArticles()

    //Delete Article From Remove Article From Data Base
    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)

















}