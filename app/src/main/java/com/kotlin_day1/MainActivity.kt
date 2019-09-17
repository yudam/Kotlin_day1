package com.kotlin_day1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    val field1: String = "maodayu"

    var field2: String = "mdy"  //编译器支持自动类型判断，即声明时不指定类型，由编译器判断

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


        var a: Int? = 10
        var b: Int? = a
        var c: Int? = a

        if (b == c) {  //两个==表示值比较
            println(true)
        }

        if (b === c) { //三个===表示比较地址
            println(false)
        }


        val bb: Byte = 1
        val cc: Int = bb.toInt() //低类型不能够显示转化为高类型

        val a1 = 1L + 3   //Long+Int可以显示转化为Long

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


    public fun sun(a: Int, b: Int): Unit {

    }


    public fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun test(a: Int, b: Int) = a + b

    public fun test1(a: Int, b: Int) = a + b   //public 修饰的方法必须明确写出返回值类型，Unit则可以省略


    //Kotlin支持三个引号扩起来的字符串，支持多行字符串
    fun moreString(args: Array<String>) {
        val strs = """maodayu
            |mdy
            |m"""

        val strs2="""
            maodayu
            yu
            mao
        """.trimMargin()   //祛除空格
    }

}
