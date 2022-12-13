package com.ifespencer.bitfit

import android.app.Application 

class BitFitApplication : Application() {
  val db by lazy {AppDatabase.getInstnace(context:this)}
}
