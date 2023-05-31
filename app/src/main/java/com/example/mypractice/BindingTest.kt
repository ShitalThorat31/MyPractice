package com.example.mypractice

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mypractice.databinding.ActivityBindingtestBinding


class BindingTest:AppCompatActivity() {
  lateinit var testBinding: ActivityBindingtestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        testBinding= ActivityBindingtestBinding.inflate(layoutInflater)
        setContentView(testBinding.root)


        val name:String
        name=testBinding.textName.text.toString()

        testBinding.btnGet.setOnClickListener(){
           Toast.makeText(this,"my name is $name",Toast.LENGTH_LONG).show()
        }

    }
}