package com.example.depttracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Delay for 2 seconds before starting the main activity
        Handler().postDelayed({
            setContentView(R.layout.activity_main)
        }, 2000)
    }
}