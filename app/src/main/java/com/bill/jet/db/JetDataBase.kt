package com.bill.jet.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class JetDataBase : RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var instance: JetDataBase? = null

        fun getInstance(context: Context): JetDataBase = instance ?: synchronized(this) {
            instance ?: buildDataBase(context).also { instance = it }
        }

        private fun buildDataBase(context: Context) =
            Room.databaseBuilder(context, JetDataBase::class.java, "jet-room").build()

    }

}
