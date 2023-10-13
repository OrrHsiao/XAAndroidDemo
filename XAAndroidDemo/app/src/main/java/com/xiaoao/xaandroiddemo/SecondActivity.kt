package com.xiaoao.xaandroiddemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    private val LogTag = "SecondActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        setContentView(R.layout.activity_second)
        val extraData = intent.getStringExtra("data")
        Log.d(LogTag, "上个页面传过来的数据:${extraData}")
    }
}