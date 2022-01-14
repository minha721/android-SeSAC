package com.example.ex1131

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val id = intent.getIntExtra("id", 0)
        val title = intent.getStringExtra("title")

        val resultView = findViewById<TextView>(R.id.tv_result)
        resultView.text = "id : $id, title : $title"
    }
}