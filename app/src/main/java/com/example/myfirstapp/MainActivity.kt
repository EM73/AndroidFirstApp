package com.example.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_click_me = findViewById(R.id.btn_click_me) as Button
        btn_click_me.setOnClickListener {
            Toast.makeText(this, "Cześć! To jest całkiem dobry tost!", Toast.LENGTH_LONG).show()
        }

        var iv_click_me = findViewById(R.id.iv_click_me) as ImageView
        iv_click_me.setOnClickListener{
            Toast.makeText(this@MainActivity, "Znaczy bass~~",Toast.LENGTH_SHORT).show()
        }
    }



    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = editText.text.toString()
        val intent = Intent(this,DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}