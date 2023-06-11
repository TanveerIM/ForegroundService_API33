package com.example.foregroundservice14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foregroundservice14.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonStartService.setOnClickListener {
            ForegroundService.startService(applicationContext, "some random service is running")
        }

        binding.buttonStopService.setOnClickListener {
            ForegroundService.stopService(applicationContext)
        }
    }
}