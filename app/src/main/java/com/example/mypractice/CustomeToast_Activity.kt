package com.example.mypractice

import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mypractice.databinding.ActivitymainCustomrtoastBinding

class CustomeToast_Activity:AppCompatActivity() {

    lateinit var binding:ActivitymainCustomrtoastBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitymain_customrtoast)

      /*  val layout = layoutInflater.inflate(R.layout.custom_toast,linealayout)

        binding.button.setOnClickListener(){
            val myToast = Toast(applicationContext)
            myToast.duration = Toast.LENGTH_LONG
            myToast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            myToast.view = layout//setting the view of custom toast layout
            myToast.show()
        }*/

    }
}