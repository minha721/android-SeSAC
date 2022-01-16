package com.example.ex1341

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {

    // 시간이 오래 걸리는 작업을 담당할 scope
    val backgroundScope = CoroutineScope(Dispatchers.Default + Job())

    lateinit var button: Button
    lateinit var resultView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        resultView = findViewById(R.id.resultView)

        button.setOnClickListener {
            backgroundScope.launch {
                var sum = 0L
                var time = measureTimeMillis {
                    for(i in 1..2000000000){
                        sum += i
                    }
                }
                // 결과값은 main dispatcher에게 의뢰해서 출력해야 함
                withContext(Dispatchers.Main){
                    resultView.text = "sum : $sum"
                }
            }
        }
    }
}