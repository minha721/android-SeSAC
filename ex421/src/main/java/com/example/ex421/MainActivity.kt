package com.example.ex421

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // View 클래스를 Activity에서 직접 생성해 화면 구성 예제

        val name = TextView(this).apply {
            typeface = Typeface.DEFAULT_BOLD
            text = "SeSAC"
        }

        val image = ImageView(this).also {
            it.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.logo_1))
        }

        val title = TextView(this).apply {
            typeface = Typeface.DEFAULT_BOLD
            text = "JetPack과 Kotlin을 활용한 Android App 개발"
        }

        // 하나로 묶어서 출력하기 위해 ViewGroup 사용
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            addView(name, WRAP_CONTENT, WRAP_CONTENT)
            addView(image, WRAP_CONTENT, WRAP_CONTENT)
            addView(title, WRAP_CONTENT, WRAP_CONTENT)
        }

        setContentView(layout)
    }
}