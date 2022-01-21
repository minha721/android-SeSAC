package com.example.ex1741

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read)

        val titleView = findViewById<TextView>(R.id.read_title)
        val contentview = findViewById<TextView>(R.id.read_content)

        val db = DBHelper(this).readableDatabase
        val cursor = db.query("tb_memo", arrayOf("title", "content"), null, null, null, null, "_id desc limit 1")

        while (cursor.moveToNext()){
            titleView.setText(cursor.getString(0))
            contentview.setText(cursor.getString(1))
        }

        db.close()
    }
}