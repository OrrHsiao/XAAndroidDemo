package com.xiaoao.xaandroiddemo.view

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.xiaoao.xaandroiddemo.R

class Nav(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

//    val nav_back_btn: Button
    init {
        LayoutInflater.from(context).inflate(R.layout.nav, this)
        Log.e("Nav", "init执行")
//        nav_back_btn = findViewById<Button>(R.id.nav_back_btn)
    }

    val nav_back_btn = findViewById<Button>(R.id.nav_back_btn).also {
        Log.e("Nav", "nav_back_btn初始化")
        it.setOnClickListener() {
            val activity = context as Activity
            activity.finish()
        }
    }

    val nav_edit_btn = findViewById<Button>(R.id.nav_edit_btn).also {
        Log.e("Nav", "nav_edit_btn初始化")
        it.setOnClickListener() {
            Toast.makeText(context, "Click Edit Btn", Toast.LENGTH_SHORT).show()
        }
    }

    val nav_title_tv = findViewById<TextView>(R.id.nav_title_tv).also {
        Log.e("Nav", "nav_title_tv初始化")
    }
}