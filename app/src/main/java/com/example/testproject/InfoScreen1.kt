package com.example.testproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class InfoScreen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_screen1)
    }

    fun skip(view: View)
    {
        val intent: Intent = Intent(this@InfoScreen1, Login::class.java)
        startActivity(intent)
    }
}