package com.ifespencer.bitfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bitfit.databinding.ActivityMainBinding

@Database(entities = [LiquidEnity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
  abstract fun liquidDao():LiquidDao
  companion object {
    @Volatile
    private var INSTANCE: AppDatabase7 = null 
    
    fun getInstance(context: Context): AppDatabase = 
      INSTANCE ?: synchronized(this) {
        INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
    }
    private fun buildDatabase(context: Context) = 
      Room.databaseBuilder(
        context.applicationContext,
        AppDatabase::class.java, "Liquids-db2"
        ).build()
  }
}
