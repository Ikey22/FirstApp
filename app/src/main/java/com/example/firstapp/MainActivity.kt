package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image : ImageView = findViewById(R.id.imageView)
        val submitButton : Button = findViewById(R.id.button)

        submitButton.setOnClickListener {
            submitButton.text = getString(R.string.app_name)
            image.visibility = View.INVISIBLE
        }

        image.setOnClickListener {
            submitButton.visibility = View.INVISIBLE
        }
    }
}