package com.meet.helloandroidstudio

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class AddToDoActivity : AppCompatActivity() {

    lateinit var editText:EditText
    lateinit var doneButton: Button
    lateinit var cancelButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_to_do)

        editText = findViewById(R.id.todoEditText)
        doneButton = findViewById(R.id.doneButton)
        doneButton.setOnClickListener{
            val text = editText.text

            val intent = Intent()
            intent.putExtra("NEW_TODO",text.toString())

            //send the intent to the parent activity
            setResult(Activity.RESULT_OK,intent)

            finish()
        }
        cancelButton = findViewById(R.id.cancelButton)
        cancelButton.setOnClickListener{
            setResult(Activity.RESULT_CANCELED)
            finish()
        }

    }
}