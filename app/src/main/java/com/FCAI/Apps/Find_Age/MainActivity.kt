package com.FCAI.Apps.Find_Age

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getAge(view:View){
        // get the Age from numeric field
        val Birthyear = yearOfBirth.text.toString().toInt()
        // calcuate the Age
        val Age = Calendar.getInstance().get(Calendar.YEAR) - Birthyear
        // showing the Age
        ageOutput.setText("You have $Age years old")
    }
}
