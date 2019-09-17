package com.kotlin_day1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = 10   //只读变量
        var num2 = 20   //可重新赋值变量

        println(num1)
        println(num2)

        //for循环  使用in操作符
        val items = listOf("123", "456", "789")
        for (item in items) {
            println(item)
        }

        for (index in items.indices) {
            println("item at $index is${items[index]}")
        }


        //while循环
        var index = 0
        while (index < items.size) {
            println("item at $index is${items[index]}")
            index++
        }

        //使用in运算符来检测是否在某个区间
        val x = 10
        val y = 6
        if (x in y..y + 10) {
            println("is range")
        }

        //区间迭代：12345
        for (k in 1..5) {
            println(k)
        }

        //数列迭代
        for (k in 1..10 step 2) {
            println(k)//13579
        }
        for (k in 9 downTo 0 step 3) {
            println(k)//9630
        }

        when {
            "123" in items -> println("123 is in range")
        }


        //使用lambda表达式来guol映射集合
        val datas = listOf("one", "two", "three")
        datas.filter { it.startsWith("t") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
    }

    //when表达式
    fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            is Long -> "Two"
            "hello" -> "Three"
            else -> "Unknown"
        }

    fun num_add(a: Int, b: Int): Int? {//变量后面加？，标识该变量可为null
        return a + b
    }

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {   //is 检测是否是某一个类型的实例，若已经检测出是某一个类型，可以直接当做该类型使用
            return obj.length
        }
        return null
    }

}
