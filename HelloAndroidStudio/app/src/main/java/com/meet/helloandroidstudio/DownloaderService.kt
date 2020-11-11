package com.meet.helloandroidstudio

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class DownloaderService : Service() {

    override fun onCreate() {
        super.onCreate()
        Log.i("DownloaderService","onCreate")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("DownloaderService","Doing my thing")
        stopSelf()
        return Service.START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("DownloaderService","onDestroy")
    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}