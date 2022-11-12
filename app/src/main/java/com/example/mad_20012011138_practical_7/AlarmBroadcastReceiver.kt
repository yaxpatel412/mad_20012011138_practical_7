package com.example.mad_20012011138_practical_7
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import java.security.Provider

class AlarmBroadcastReceiver {
  fun onReceive(context: Context,intent: Intent){
      val str1 = intent.getStringExtra("Service1")
      if(str1 =="start" || str1 =="stop")
      {
          val intentService = Intent(context, AlarmService::class.java)
          intentService.putExtra("Service1", intent.getStringExtra("Service1"))
          if(str1 == "Start")
          {
              context.startService(intentService)
          }
          else if(str1=="Stop") {
              context.stopService(intentService)
          }

      }
  }

}