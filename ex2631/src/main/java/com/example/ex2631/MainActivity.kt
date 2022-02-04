package com.example.ex2631

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ex2631.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpager.adapter = MyAdapter(this)
    }
}