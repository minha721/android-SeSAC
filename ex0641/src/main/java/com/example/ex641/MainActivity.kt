package com.example.ex641

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn_tab1)
        val btn2 = findViewById<Button>(R.id.btn_tab2)
        val content1 = findViewById<TextView>(R.id.tv_content1)
        val content2 = findViewById<TextView>(R.id.tv_content2)

        btn1.setOnClickListener {
            content1.visibility = View.VISIBLE
            content2.visibility = View.INVISIBLE
        }

        btn2.setOnClickListener {
            content2.visibility = View.VISIBLE
            content1.visibility = View.INVISIBLE
        }
    }
}