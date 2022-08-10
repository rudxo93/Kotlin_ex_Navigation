package com.duran.navigationsafeargs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// 대상 간 데이터전달에 대한 구글 공식 문서
// https://developer.android.com/guide/navigation/navigation-pass-data?hl=ko#kts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}