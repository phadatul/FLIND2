package com.meet.helloandroidstudio

import android.app.IntentService
import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class ImageDownloadService : IntentService("IMAGE_DOWNLOADER") {

    override fun onCreate() {
        super.onCreate()
        Log.i("ImageDownloaderService","onCreate")
    }


    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onHandleIntent(intent: Intent?) {
        if(intent!=null){
            Thread.sleep(10000)
            val link = intent.getStringExtra("IMAGE_LINK")
            if(link!=null) {
                val bitmap = NetWorkUtils.getImage(link)
                if(bitmap!=null){
                    Log.i("ImageDownloaderService","Image Downloaded successfully")
                    SharedData.bitmapData = bitmap
                    val intent = Intent("com.meet.helloandroidstudio.IMAGE_SUCESS")
                    sendBroadcast(intent)

                }
                else {
                    Log.i("ImageDownloaderService", "Failed to download iamge")
                }
            }
        }
    }
}