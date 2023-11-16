package com.xiaoao.xaandroiddemo.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.xiaoao.xaandroiddemo.R

class Nav(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.nav, this)
    }
}