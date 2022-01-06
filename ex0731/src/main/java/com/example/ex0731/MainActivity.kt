package com.example.ex0731

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tvResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvResult = findViewById(R.id.tv_result) 
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var eventType = ""

        when(event?.action){
            MotionEvent.ACTION_DOWN -> eventType = "DOWN EVENT"
            MotionEvent.ACTION_UP -> eventType = "UP EVENT"
            MotionEvent.ACTION_MOVE -> eventType = "MOVE EVENT"
        }

        tvResult.text = "$eventType : x - ${event?.x}, y - ${event?.y}"
        return super.onTouchEvent(event)
    }
}