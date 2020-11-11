package com.meet.helloandroidstudio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editText:EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        //infalte a layout
        val mainView = LayoutInflater.from(this).inflate(R.layout.activity_main,null)
        //attach the infated view tree to activity
        setContentView(mainView)

        editText = findViewById(R.id.editText)

//
//        if(savedInstanceState !=null)
//            Log.i("MainActivity","The saveInstanceState not null")
//        else
//            Log.i("MainActivity", "The saveInstanceState null")

    }

    fun send(view: View){

        val text = editText.editableText.toString()
        Log.i("MainActivity","User entered = $text")

        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }


    fun launchSecond(view: View){
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }

    fun browseWeb(view: View){
        val intent = Intent(Intent.ACTION_VIEW)
        val uri = Uri.parse("https://www.google.com")
        intent.data = uri


        startActivity(intent)

    }

    fun launchMain(view: View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

    fun dialPhone(view: View){
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:555555555")
        startActivity(intent)

    }

    fun launchService(view: View){
        val intent = Intent(this,DownloaderService::class.java)
        startService(intent)
    }

}