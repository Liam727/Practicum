package com.example.finalpracticum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val introText=findViewById<TextView>(R.id.introText)
        val exitBtn=findViewById<Button>(R.id.exitBtn)
        val enterBtn=findViewById<Button>(R.id.enterBtn)
        val nameText=findViewById<TextView>(R.id.nameText)

        //Button used to continue to the next screen
        enterBtn.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        //Button used to exit the programme
        exitBtn.setOnClickListener {
            val intent =Intent(this,MainActivity2::class.java)
            startActivity(Intent())

        }



    }
}