package com.duran.navigationanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// 첫번째 Fragment - A / 두번째 Fragment - B

// enterAnim - A -> B 갈 때 B가 보이는 방식
// exitAnim - A -> B 갈 때 A가 사라지는 방식
// popEnterAnim - 뒤로가기 B -> A로 올 때 A가 나타나는 방식
// popExitAnim - 뒤로가기로 B -> A로 올 때 B가 사라지는 방식

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}