package com.example.ex0741

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer

class MainActivity : AppCompatActivity() {

    // 멈춤 시간을 저장하기 위한 변수
    var pauseTime = 0L

    lateinit var startButton : Button
    lateinit var stopButton : Button
    lateinit var resetButton : Button
    lateinit var chronometer: Chronometer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton = findViewById(R.id.btn_start)
        stopButton = findViewById(R.id.btn_stop)
        resetButton = findViewById(R.id.btn_reset)
        chronometer = findViewById(R.id.chronometer)

        startButton.setOnClickListener {
            chronometer.base = SystemClock.elapsedRealtime() + pauseTime
            chronometer.start()

            stopButton.isEnabled = true
            resetButton.isEnabled = true
            startButton.isEnabled = false
        }

        stopButton.setOnClickListener {
            pauseTime = chronometer.base - SystemClock.elapsedRealtime()
            chronometer.stop()

            stopButton.isEnabled = false
            resetButton.isEnabled = true
            startButton.isEnabled = true
        }

        resetButton.setOnClickListener {
            pauseTime = 0L
            chronometer.base = SystemClock.elapsedRealtime()
            chronometer.stop()

            stopButton.isEnabled = false
            resetButton.isEnabled = false
            startButton.isEnabled = true
        }
    }
}