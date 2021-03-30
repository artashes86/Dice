package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagView = findViewById<ImageView>(R.id.image)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val rollNumber = roll()
            when(rollNumber){
                1 -> (imagView.setImageResource(R.drawable._1))
                2 -> (imagView.setImageResource(R.drawable._2))
                3 -> (imagView.setImageResource(R.drawable._3))
                4 -> (imagView.setImageResource(R.drawable._4))
                5 -> (imagView.setImageResource(R.drawable._5))
                6 -> (imagView.setImageResource(R.drawable._6))
            }
        }
    }

    fun roll(): Int{
        val roller = (1..6).random()
        return roller
    }
}