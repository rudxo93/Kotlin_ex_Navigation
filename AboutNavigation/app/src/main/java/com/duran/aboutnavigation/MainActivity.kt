package com.duran.aboutnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)

        val manager = supportFragmentManager

        btn1.setOnClickListener {
            val transaction = manager.beginTransaction()
            val fragment1 = BlankFragment1()
            transaction.replace(R.id.frameArea, fragment1)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        btn2.setOnClickListener {
            val transaction = manager.beginTransaction()
            val fragment2 = BlankFragment2()
            transaction.replace(R.id.frameArea, fragment2)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}