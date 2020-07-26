package com.androidstation.breakingnews.db

import android.content.Context
import androidx.room.*
import com.androidstation.breakingnews.model.Article


@Database(
    //tables
    entities = [Article::class],
    //versions of database
    version = 1
)
@TypeConverters(Converters::class)
abstract class ArticleDatabase : RoomDatabase() {
    //function to return Article dao

    abstract fun getArticleDao(): ArticleDao

    companion object {
        //volatile annotation can tell Others threads if an thing changes
        @Volatile
        private var instance: ArticleDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {

            instance ?: creatdatabse(context).also { instance = it }

        }

        private fun creatdatabse(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                ArticleDatabase::class.java,
                "article_db.db"

            ).build()

    }
}