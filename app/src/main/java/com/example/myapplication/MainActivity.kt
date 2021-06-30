package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username1 = findViewById(R.id.username) as EditText
        var password1 = findViewById(R.id.password) as EditText
        var password2 = findViewById(R.id.password2) as EditText
        var btn_submit = findViewById(R.id.btn_submit) as Button

        btn_submit.setOnClickListener {
            val username = username1.text;
            val password = password1.text;
            val password_2 = password2.text;
            if(username.isNotEmpty() && password.isNotEmpty() && password_2.isNotEmpty()) {
                val intent = Intent(this, List::class.java)
                startActivity(intent)
            } else if(username.isEmpty()){
                username1?.error = "Este campo es requerido"
            } else if(password.isEmpty()) {
                password1?.error = "Este campo es requerido"
            } else {
                password2?.error = "Este campo es requerido"
            }

        }
    }
}