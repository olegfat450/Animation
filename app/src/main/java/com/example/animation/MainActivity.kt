package com.example.animation

import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

         private lateinit var button: Button
         private lateinit var imageTv: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        imageTv = findViewById(R.id.imageTv)

        val animation1 = AnimationUtils.loadAnimation(this,R.anim.blink)
        val animation2 = AnimationUtils.loadAnimation(this,R.anim.move)

        imageTv.startAnimation(animation1)
        button.startAnimation(animation2)

        button.setOnClickListener { startActivity(Intent(this,RegActivity::class.java)) }



    }
}