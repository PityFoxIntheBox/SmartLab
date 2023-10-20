package com.example.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.text.Editable
import com.example.testproject.databinding.ActivityCodeInputBinding
import com.example.testproject.databinding.ActivityLoginBinding
import java.util.Timer
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

class code_input : AppCompatActivity() {

    var binding : ActivityCodeInputBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCodeInputBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        timer.start()
    }
    val timer = object : CountDownTimer(60000,1000)
    {
        override fun onTick(millisUntilFinished: Long) {
            binding!!.count.text = "Отправить код повторно можно будет через " + millisUntilFinished.milliseconds.inWholeSeconds + " секунд"
        }

        override fun onFinish() {
            start()
        }
    }
}