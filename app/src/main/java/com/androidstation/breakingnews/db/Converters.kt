package com.androidstation.breakingnews.db

import androidx.room.TypeConverter
import com.androidstation.breakingnews.model.Source


//Converters class to convert source to String
class Converters {

    @TypeConverter
    fun fromSource(source: Source): String{
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source{
        return Source(name, name)
    }
}