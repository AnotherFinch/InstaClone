package com.example.instaclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instaclone.databinding.ActivityMainBinding
import com.example.instaclone.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //
        binding.testButton1.setOnClickListener{
            val i = Intent(this, RegistrationActivity::class.java)
            startActivity(i)
        }

    }

}