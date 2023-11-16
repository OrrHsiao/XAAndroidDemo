package com.xiaoao.xaandroiddemo.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.Toast
import com.xiaoao.xaandroiddemo.R
import com.xiaoao.xaandroiddemo.view.Nav

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        supportActionBar?.hide()
        setContentView(R.layout.first_layout)
        //按钮
        val button1 = findViewById<Button>(R.id.first_activity_button1)
        button1.setOnClickListener {
            //显示一个提示
            Toast.makeText(this, "点击了button1", Toast.LENGTH_SHORT).show()
            pushToSecondActivity()
        }

        val nav = findViewById<Nav>(R.id.first_activity_nav)
        println(nav.nav_back_btn.text)
        println(nav.nav_back_btn.text)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    /**
     * 跳转到SecondActivity
     */
    private fun pushToSecondActivity() {
        //显式Intent
        val intent = Intent(this, SecondActivity::class.java)
        val data = "这是上个页面传过来的数据"
        //传参
        intent.putExtra("data", data)
        //跳转
        startActivity(intent)
        //带返回结果的跳转
//        startActivityForResult(intent, 1)
        //隐式Intent
//        val intent = Intent("com.xiaoao.ACTION_START")
//        intent.addCategory("android.intent.category.CUSTOM")
//        startActivity(intent)
        //隐式Intent启动其他程序的Activity
//        val intent = Intent(Intent.ACTION_VIEW)
//        intent.data = Uri.parse("https://www.baidu.com")
//        startActivity(intent)
    }
}