package com.example.ex2651

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ex2651.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fab.setOnClickListener {
            when(binding.fab.isExtended){
                true -> binding.fab.shrink()
                false -> binding.fab.extend()
            }
        }
    }
}