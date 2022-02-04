package com.example.ex2611

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ex2611.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val oneFragment = OneFragment()
        val twoFragment = TwoFragment()

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()

        // 액티비티 실행시 oneFragment 실행
        transaction.add(R.id.fragment_content, oneFragment)
        transaction.commit()

        // one 버튼 누르면 oneFragment 실행
        binding.btnOne.setOnClickListener {
            // commit하면 transaction 객체가 닫혀서 다시 선언
            val tran = manager.beginTransaction()
            tran.replace(R.id.fragment_content, oneFragment)
            tran.commit()
        }

        // two 버튼 누르면 twoFragment 실행
        binding.btnTwo.setOnClickListener {
            val tran = manager.beginTransaction()
            tran.replace(R.id.fragment_content, twoFragment)
            tran.commit()
        }
    }
}