package com.example.mytutor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.mytutor.SchoolYears.ActivityOne
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // Here are all the buttons inside this activity that lead to their specific school year
        //Plus the overridePendingTransaction allows me to null the transition on the activity start

       button.setOnClickListener(){
           startActivity(Intent(this, ActivityOne::class.java))
           overridePendingTransition(0,0)
       }
      button2.setOnClickListener(){
               startActivity(Intent(this, ActivityOne::class.java))
          overridePendingTransition(0,0)
           }
      button3.setOnClickListener(){
               startActivity(Intent(this, ActivityOne::class.java))
          overridePendingTransition(0,0)
           }
      button4.setOnClickListener(){
               startActivity(Intent(this, ActivityOne::class.java))
          overridePendingTransition(0,0)
           }
      button5.setOnClickListener(){
               startActivity(Intent(this, ActivityOne::class.java))
          overridePendingTransition(0,0)
           }
      button6.setOnClickListener(){
               startActivity(Intent(this, ActivityOne::class.java))
          overridePendingTransition(0,0)
           }
      button7.setOnClickListener(){
               startActivity(Intent(this, ActivityOne::class.java))
          overridePendingTransition(0,0)
           }
      button8.setOnClickListener(){
               startActivity(Intent(this, ActivityOne::class.java))
          overridePendingTransition(0,0)

           }
      button9.setOnClickListener(){
               startActivity(Intent(this, ActivityOne::class.java))
          overridePendingTransition(0,0)
               }
      button10.setOnClickListener(){
               startActivity(Intent(this, ActivityOne::class.java))
          overridePendingTransition(0,0)
           }
      button11.setOnClickListener(){
               startActivity(Intent(this, ActivityOne::class.java))
          overridePendingTransition(0,0)
           }
      button12.setOnClickListener(){
               startActivity(Intent(this, ActivityOne::class.java))
          overridePendingTransition(0,0)
           }


    }
}