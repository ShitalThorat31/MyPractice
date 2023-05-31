package com.example.mypractice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class TestDesign: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)

        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener(){


            startActivity(Intent(this,Registration::class.java))
        }

    }

}