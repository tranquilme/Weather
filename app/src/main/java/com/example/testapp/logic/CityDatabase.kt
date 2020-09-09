package com.example.testapp.logic

import android.content.Context
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteOpenHelper
import com.example.testapp.logic.dao.CityDao
import com.example.testapp.logic.model.City

@Database(entities = [City::class], version = 1)
abstract class CityDatabase : RoomDatabase() {
    abstract fun cityDao(): CityDao

    companion object {
        private var INSTANCE: CityDatabase? = null

        @Synchronized
        fun getCityDatabase(context: Context): CityDatabase {
            INSTANCE?.let {
                return it
            }
            return Room.databaseBuilder(
                context.applicationContext,
                CityDatabase::class.java,
                "city_database"
            ).build().apply {
                INSTANCE = this
            }
        }
    }
}