package com.meet.helloandroidstudio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editText:EditText;
    lateinit var sendButton: Button;

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity","onResume")
    }
    override fun onStart() {
        super.onStart()
        Log.i("MainActivity","onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity","onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity","onDestroy")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MainActivity","onCreate")
//        setContentView(R.layout.activity_main)

        //infalte a layout
        val mainView = LayoutInflater.from(this).inflate(R.layout.activity_main,null)
        //attach the infated view tree to activity
        setContentView(mainView)

        val launchingIntent = getIntent()
        if(launchingIntent.extras!=null){
            Log.i("MainActivity","launching intent has extras")
        }
        else
            Log.i("MainActivity","launching intent has NO extras")


        editText = findViewById(R.id.editText)
        sendButton = findViewById(R.id.sendButton)
//        sendButton.setOnClickListener(object:View.OnClickListener{
//            override fun onClick(p0: View?) {
//                Log.i("MainActivity","ButtonTapped")
//            }
//        })

        sendButton.setOnClickListener{
            val text = editText.editableText.toString()
            Log.i("MainActivity","User entered = $text")

            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("MESSAGE",text)
            startActivity(intent)
        }


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