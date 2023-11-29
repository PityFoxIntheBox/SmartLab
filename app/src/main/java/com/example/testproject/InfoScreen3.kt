package com.example.testproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class InfoScreen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_screen3)
    }

    fun skip(view: View)
    {
        val intent: Intent = Intent(this@InfoScreen3, Login::class.java)
        startActivity(intent)
    }
}