package com.androidstation.breakingnews.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.androidstation.breakingnews.model.Article

@Dao
interface ArticleDao {

    //Insert with on Conflict Strategy to update the exist article in table by replace it
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upSert(article: Article): Long

    //Query from data base
    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

    //delete
    @Delete
    suspend fun deleteArticle(article: Article)
}