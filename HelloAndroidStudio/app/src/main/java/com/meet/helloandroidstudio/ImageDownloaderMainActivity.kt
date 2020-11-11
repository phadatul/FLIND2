package com.meet.helloandroidstudio

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import java.net.URL

class ImageDownloaderMainActivity : AppCompatActivity() {

    lateinit var imageView:ImageView
    lateinit var button:Button
    var link = "https://images.unsplash.com/photo-1451187580459-43490279c0fa?ixlib=rb-1.2.1&auto=format&fit=crop&w=1052&q=80"
    lateinit var receiver: BroadcastReceiver

    inner class ImageDownloadReceiver : BroadcastReceiver(){
        override fun onReceive(p0: Context?, p1: Intent?) {
            Log.i("ImageDownloadReceiver","onReceive")
            imageView.setImageBitmap(SharedData.bitmapData)
        }
    }

    override fun onResume() {
        super.onResume()
        receiver = ImageDownloadReceiver()
        val intentFilter = IntentFilter("com.meet.helloandroidstudio.IMAGE_SUCESS")
        registerReceiver(receiver,intentFilter)
    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(receiver)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_downloader_main)

        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.downloadButton)
        button.setOnClickListener {
            val intent = Intent(this,ImageDownloadService::class.java)
            intent.putExtra("IMAGE_LINK",link)
            startService(intent)
        }

    }

}