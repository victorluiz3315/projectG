package com.projectg

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.projectg.databinding.ActivityLoginBinding

class login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Entrar.setOnClickListener{

        }
    }
}