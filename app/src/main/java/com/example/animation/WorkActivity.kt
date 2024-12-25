package com.example.animation

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class WorkActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_work)


        val nameText = findViewById<TextView>(R.id.nameText)
        val passwordText = findViewById<TextView>(R.id.passwordText)



        nameText.setText("Здравстсвуйте,${intent.getStringExtra("name")!!.capitalize(Locale.ROOT)}")

        val password = intent.getStringExtra("password")

        passwordText.setOnClickListener { passwordText.setText(password)

            passwordText.setTextColor(Color.RED)

        val animation = AnimationUtils.loadAnimation(this,R.anim.blink)


        passwordText.startAnimation(animation)}

    }
}