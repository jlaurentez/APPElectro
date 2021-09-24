package com.example.appelectroconsum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val btnLogin = findViewById<Button>(R.id.btnLogIn)
        btnLogin.setOnClickListener{
            val lanzar = Intent (this, HomeActivity::class.java)
            startActivity(lanzar)
        }

    }
}