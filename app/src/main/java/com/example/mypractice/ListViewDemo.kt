package com.example.mypractice

import android.os.Bundle
//import android.os.PersistableBundle
//import android.view.View
//import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
//import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ListViewDemo: AppCompatActivity()
{

    private val language = arrayOf<String>("C","C++","Java",".Net","Kotlin","Ruby","Rails","Python","Java Script","Php","Ajax","Perl","Hadoop")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listview_demo)

       // val myListAdapter = MyListAdapter(this,language)
        val adapter1 = ArrayAdapter(this,
            R.layout.listview_item,R.id.textView, language)
        val listView:ListView=findViewById(R.id.listView)
        listView.adapter=adapter1
        /*listView.adapter = myListAdapter
        listView.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()
        }*/
    }


}