package com.example.mypractice

import android.os.Bundle
import android.widget.CheckedTextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CheckedTextView: AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checked_textview)
    val CTView = findViewById<CheckedTextView>(R.id.checkedTextView)
    if (CTView != null) {
        CTView.isChecked = false
        CTView.setCheckMarkDrawable(
            android.R.drawable.checkbox_off_background)

        CTView.setOnClickListener {
            CTView.isChecked = !CTView.isChecked
            CTView.setCheckMarkDrawable(
                if (CTView.isChecked)
                    android.R.drawable.checkbox_on_background
                else
                    android.R.drawable.checkbox_off_background)

            val msg = getString(R.string.msg_shown)+ " " +
                    getString(if (CTView.isChecked)
                        R.string.checked else R.string.unchecked)
            Toast.makeText(this, msg,
                Toast.LENGTH_SHORT).show()
        }
    }
}}