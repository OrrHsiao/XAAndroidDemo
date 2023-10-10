package com.xiaoao.xaandroiddemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        val button1 = findViewById<Button>(R.id.first_activity_button1)
        button1.setOnClickListener {
            Toast.makeText(this, "点击了button1", Toast.LENGTH_SHORT).show()
        }
    }
}