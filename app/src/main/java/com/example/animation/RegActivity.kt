package com.example.animation

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegActivity : AppCompatActivity() {

    private lateinit var layout: LinearLayout


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reg)


         val textTv = findViewById<TextView>(R.id.textTv)
         val button = findViewById<Button>(R.id.button)
         val name = findViewById<EditText>(R.id.nameText)
         val password = findViewById<EditText>(R.id.regText)
        layout = findViewById(R.id.layout1)


        val animation1 = AnimationUtils.loadAnimation(this,R.anim.movedown)
        val animatiob2 = AnimationUtils.loadAnimation(this,R.anim.moveup)

        textTv.startAnimation(animation1)
        layout.startAnimation(animatiob2)



        button.setOnClickListener {

            if ( name.text.isEmpty() or password.text.isEmpty() ) return@setOnClickListener

           val intent = Intent(this,WorkActivity::class.java)
            intent.putExtra("name",name.text.toString())
            intent.putExtra("password",password.text.toString())
            startActivity(intent)
        }

    }


}