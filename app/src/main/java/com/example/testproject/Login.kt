package com.example.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.widget.AppCompatButton
import com.example.testproject.databinding.ActivityLoginBinding

class Login : AppCompatActivity(),TextWatcher {

    public var binding : ActivityLoginBinding? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        binding!!.editTextTextEmailAddress.addTextChangedListener(this)
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        checkEmail()
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        checkEmail()
    }

    override fun afterTextChanged(s: Editable?) {
        checkEmail()
    }

    private fun checkEmail()
    {
        if(binding != null)
        {
            if(Regex("^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$").containsMatchIn(binding!!.editTextTextEmailAddress.text)) {
                binding!!.button.isEnabled = true
                binding!!.button.setBackgroundResource(R.drawable.color_button)
            }
            else
            {
                binding!!.button.isEnabled = false
                binding!!.button.setBackgroundResource(R.drawable.uncolor_button)
            }
        }

    }

}