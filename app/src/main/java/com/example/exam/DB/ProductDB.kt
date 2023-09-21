package com.example.exam.DB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [ProductEntity::class], version = 1)
abstract class ProductDB : RoomDatabase() {

    companion object {

        fun init(context: Context): ProductDB {
            var db = Room.databaseBuilder(context, ProductDB::class.java, "Product")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()

            return db
        }

    }

    abstract fun productDao(): ProductDao

}