
package com.example.mad_20012011138_practical_7

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class AlarmService : Service() {
    var mp: MediaPlayer? = null
    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if(intent != null) {
            mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_alarm);
            mp?.start()
        }
        return START_STICKY
    }
    override fun onDestroy() {
        mp?.stop()
        super.onDestroy()
    }
}