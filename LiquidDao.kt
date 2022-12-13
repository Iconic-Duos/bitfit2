package com.example.bitfit

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface LiquidDao {
  @Query("SELECT * FROM liquid_table")
  fun getAll(): Flow<List<LiquidEntity>>
  
  @Insert 
  fun insertALL(liquids:List<LiquidEntity>)
  
  @Insert 
  fun insert(liquid: LiquidEntity)
  
  @Query("DELETE FROM liquid_table")
  fun deleteAll()
}
