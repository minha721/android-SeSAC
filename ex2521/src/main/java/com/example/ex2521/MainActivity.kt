package com.example.ex2521

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ex2521.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVisible.setOnClickListener {
            binding.tvTarget.visibility = View.VISIBLE
        }
        binding.btnInvisible.setOnClickListener {
            binding.tvTarget.visibility = View.INVISIBLE
        }
    }
}