package com.example.ex1141

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    lateinit var resultView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.btn_btn1)
        val button2 = findViewById<Button>(R.id.btn_btn2)
        resultView = findViewById(R.id.tv_result)

        // startActivityForResult
        button1.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("id", "first")
            startActivityForResult(intent, 10)
        }

        // ActivityResultLauncher 사후처리
        val resultLauncher : ActivityResultLauncher<Intent> = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()){
            resultView.text = "result : ${it.data?.getStringExtra("result")}"
        }

        // ActivityResultLauncher
        button2.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("id", "second")
            resultLauncher.launch(intent)
        }
    }

    // startActivityForResult 사후처리
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 10 && resultCode == RESULT_OK){
            val result: String? = data?.getStringExtra("result")
            resultView.text = "result : $result"
        }
    }
}