package com.duran.navigationex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
fragment가 1 -> 2 -> 3 -> 4 -> 5가 있다고 하자
1 -> 2 -> 3 -> 4 -> 5에서 BackButton을 누르게되면 5 -> 4 -> 3 -> 2 -> 1이 된다
5에서 BackButton을 누르게되면 바로 1로 가게끔 해보자
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}