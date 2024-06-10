package com.example.finalpracticum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    enum class Day {
        Sunny,
        Cloudy,
        Raining,
        Windy,
        Hot,
        Cold
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)




        val nxtBtn =findViewById<Button>(R.id.nxtBtn)
        val typeOfDay=findViewById<Spinner>(R.id.typeOfDay)
        val highestTemp=findViewById<EditText>(R.id.highestTemp)
        val lowestTemp=findViewById<EditText>(R.id.lowestTemp)
        val avgTemp=findViewById<TextView>(R.id.avgTemp)
        val inputBtn=findViewById<Button>(R.id.inputBtn)


        typeOfDay.adapter= ArrayAdapter<MainActivity2.Day>(
            this,
            android.R.layout.simple_list_item_1,
            Day.values()
        )

        nxtBtn.setOnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }

        inputBtn.setOnClickListener {
            val text=highestTemp.text.toString()
            avgTemp.text=text
        }








    }


    }


