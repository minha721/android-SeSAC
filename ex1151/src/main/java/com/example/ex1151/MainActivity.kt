package com.example.ex1151

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent()
            intent.action = "ACTION_DETAIL"
            // 카테고리는 지정하지 않으면 기본적으로 DEFAULT로 지정 됨
            intent.data = Uri.parse("http://www.google.com")
            startActivity(intent)
        }
    }
}