package com.example.myandroidapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//This is the class that executes when the application is launched
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //This call will set the "activity_main" layout to load.
        setContentView(R.layout.activity_main)
    }
}