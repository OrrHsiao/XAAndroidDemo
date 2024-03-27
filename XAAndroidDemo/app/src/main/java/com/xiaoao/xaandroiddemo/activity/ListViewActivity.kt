package com.xiaoao.xaandroiddemo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.xiaoao.xaandroiddemo.R

class ListViewActivity : AppCompatActivity() {
    private val dataSource = listOf<String>("Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Heidi", "Ivan", "Judy",
        "Mike", "Nina", "Oliver", "Peggy", "Quentin", "Randy", "Sybil", "Trent", "Uma", "Vicky")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        initViews()
    }

    private fun initViews() {
        val listView = findViewById<ListView>(R.id.listview)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataSource)
        listView.adapter = adapter
    }
}