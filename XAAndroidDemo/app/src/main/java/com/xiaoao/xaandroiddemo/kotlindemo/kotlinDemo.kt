package com.xiaoao.xaandroiddemo.kotlindemo

class KotlinLanguage() {

    fun valueDemo() {
        //Int
        val one = 1
        //Long
        val threeBillion = 3000000000
        val oneLong = 1L
        //Byte
        val oneByte: Byte = 1
        //UInt
        val uint: UInt = 1u
        //Double
        val pi = 3.14
        val oneDouble: Double = 1.0
        //float
        val e = 2.718f
        //转化
        val c = e.toFloat()

    }
}

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

