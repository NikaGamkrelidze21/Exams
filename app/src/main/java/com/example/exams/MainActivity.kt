package com.example.exams

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first_photo.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.imageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        photo1.setOnClickListener {
            val intent = Intent(this, FirstPhoto::class.java)
            startActivity(intent)
        }
        photo2.setOnClickListener() {
            val intent = Intent(this, Photo2::class.java)
            startActivity(intent)
        }
        photo3.setOnClickListener() {
            val intent = Intent(this, Photo3::class.java)
            startActivity(intent)
        }
        photo4.setOnClickListener() {
            val intent = Intent(this, Photo4::class.java)
            startActivity(intent)
        }

        checkOutButton.setOnClickListener() {
            val intent = Intent(this, Basket::class.java)
            startActivity(intent)
        }
        imageButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        login_main.setOnClickListener {
            val intent = Intent(this, aythentication::class.java)
            startActivity(intent)
        }
        settingButton_main.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }


    }
}
