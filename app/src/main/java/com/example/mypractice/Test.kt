package com.example.mypractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mypractice.R

class Test : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.autocomplete_textview)
        var i: Int
        var j: Int
        i = 1
        while (i <= 5) {
            j = 1
            while (j <= 5) {
                print("*")
                j++
            }
            i++
        }
    }
}