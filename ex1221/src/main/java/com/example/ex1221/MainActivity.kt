package com.example.ex1221

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count = 0
    lateinit var editView: EditText
    lateinit var countView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countView = findViewById(R.id.tv_count)
        val button = findViewById<Button>(R.id.btn_count)
        editView = findViewById(R.id.et_edit)

        button.setOnClickListener {
            count ++
            countView.text = "$count"
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("count", count)
        outState.putString("edit", editView.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        count = savedInstanceState.getInt("count")
        countView.text = "$count"
        editView.setText(savedInstanceState.getString("edit"))
    }
}