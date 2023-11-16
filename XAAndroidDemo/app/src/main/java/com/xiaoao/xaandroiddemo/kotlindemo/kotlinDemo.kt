package com.xiaoao.xaandroiddemo.kotlindemo

class InitOrderDemo(name: String) {
    init {
        println("主init执行")
    }

    val firstProperty = "First property: $name".also(::println)
    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)
    init {
        println("Second initializer block that prints ${name.length}")
    }
}

fun main() {
    InitOrderDemo("haha")
}