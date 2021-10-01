package com.example.appelectroconsum

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val btnLogin = findViewById<ImageButton>(R.id.btnLogIn)
        btnLogin.setOnClickListener{
            val lanzar = Intent (this, HomeActivity::class.java)
            startActivity(lanzar)
        }

    }
}