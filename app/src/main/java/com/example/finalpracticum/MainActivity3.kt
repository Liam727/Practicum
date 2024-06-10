package com.example.finalpracticum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var highArray= arrayListOf<Int>(30, 20, 25, 18, 22, 16, 26)
        var lowArray= arrayListOf<Int>(15, 10, 17, 9, 18, 13, 20)
        val backBtn =findViewById<Button>(R.id.backBtn)

        //Used to display all highest values
        val textView2= findViewById<TextView>(R.id.textView2)
        textView2.text=highArray.toString()

        //used to dispay all lowest values
        val textView3=findViewById<TextView>(R.id.textView3)
        textView3.text=lowArray.toString()

//Button used to go back to previous screen
        backBtn.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }





        
    }
}