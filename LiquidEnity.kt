package com.example.bitfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bitfit.databinding.ActivityMainBinding

@Enity (tableName = "liquid_table")
data class LiquidEnity(
  @PrimaryKey(autoGenerate = true) val id: Long = 0,
  @ColumnInfo(name = "name") val name: String?,
  @ColumnInfo(name = "amount") val amount: Long?
)
