package com.example.ex1321

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.widget.ImageView
import android.widget.TextView
import java.lang.Exception
import java.lang.String

class MainActivity : AppCompatActivity() {

    lateinit var startView : ImageView
    lateinit var pauseView : ImageView
    lateinit var textView: TextView

    // 스레드 제어 목적 변수
    var loopFlag = true
    var isFirst = true
    var isRun = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startView = findViewById(R.id.main_startBtn)
        pauseView = findViewById(R.id.main_pauseBtn)
        textView = findViewById(R.id.main_textView)

        startView.setOnClickListener {
            if(isFirst){
                isFirst = false
                isRun = true
                thread.start()
            }else{
                isRun = true
            }
        }
        pauseView.setOnClickListener {
            isRun = false
        }
    }

    var handler: Handler = object: Handler() {
        override fun handleMessage(msg: Message) {
            if(msg.what === 1){
                textView.setText(String.valueOf(msg.arg1))
            } else if(msg.what === 2){
                textView.text = msg.obj as String
            }
        }
    }

    var thread: Thread = object: Thread() {
        override fun run() {
            try{
                var count = 10
                while(loopFlag){
                    sleep(1000)
                    if(isRun) {
                        count--
                        var message = Message()
                        message.what = 1
                        message.arg1 = count
                        handler.sendMessage(message)
                        if (count == 0){
                            message = Message()
                            message.what = 2
                            message.obj = "Finish!!"
                            handler.sendMessage(message)
                            loopFlag = false
                        }
                    }
                }
            }catch(e: Exception){

            }
        }
    }
}