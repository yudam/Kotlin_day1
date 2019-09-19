package com.kotlin_day1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    val field1: String = "maodayu"

    var field2: String = "mdy"  //编译器支持自动类型判断，即声明时不指定类型，由编译器判断

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val  person=Person("maodayu",26)

        val person1:Person=Person("zongwen",27)


        println("name="+person.name+"  age="+person.age)

        println("name1="+person1.name+"  age1="+person1.age)

        person.height=180.1
        println(person.height)


        person.printTest()


        println(Person.Teacher().learn())
        println(Person.Teacher().score())


        val inner_class:Person.Inner=Person("mdy",20).Inner()
        inner_class.inner_test()

        val nmClass = NMClass()

        //匿名内部类
        nmClass.setTest(object : IInterface {
            override fun test() {
                println("interface is test")//To change body of created functions use File | Settings | File Templates.
            }
        })

//        val num1 = 10   //只读变量
//        var num2 = 20   //可重新赋值变量
//
//
//        //IF表达式结果
//        val max0 = if (num1 > num2) num1 else num2
//
//        println("max0="+max0)
//        val max1 = if (num1 > num2) {
//            num1
//        } else {
//            num2
//        }
//        println("max1="+max1)
//
//        val max2 = if (true) num1 else num2
//
//        println("max2="+max2)
//
//        when(5){
//            1-> println("inddex =1")
//            2-> println("index = 2")
//            5-> println("index = 5")
//            6,7-> println()
//            else -> println("index is else")
//        }
//
//
//        when{
//            1 in 0..10 -> println("1 in ranges")
//            2 in 0..5 -> println("2 in ranges")
//            6 in 0..2 -> println("6 in ranges")
//            else -> println("else is ranges")
//        }
//
//        //for循环  使用in操作符
//        val items = listOf("123", "456", "789")
//        for (item in items) {
//            println(item)
//        }
//
//        for (index in items.indices) {
//            println("item at $index is${items[index]}")
//        }
//
//
//        //while循环
//        var index = 0
//        while (index < items.size) {
//            println("item at $index is${items[index]}")
//            index++
//        }
//
//        //使用in运算符来检测是否在某个区间
//        val x = 10
//        val y = 6
//        if (x in y..y + 10) {
//            println("is range")
//        }
//
//        //区间迭代：12345
//        for (k in 1..5) {
//            println(k)
//        }
//
//        //数列迭代
//        for (k in 1..10 step 2) {
//            println(k)//13579
//        }
//        for (k in 9 downTo 0 step 3) {
//            println(k)//9630
//        }
//
//        when {
//            "123" in items -> println("123 is in range")
//            else -> false
//        }
//
//
//        //使用lambda表达式来guol映射集合
//        val datas = listOf("one", "two", "three")
//        datas.filter { it.startsWith("t") }
//            .sortedBy { it }
//            .map { it.toUpperCase() }
//            .forEach { println(it) }
//
//
//        var a: Int? = 10
//        var b: Int? = a
//        var c: Int? = a
//
//        if (b == c) {  //两个==表示值比较
//            println(true)
//        }
//
//        if (b === c) { //三个===表示比较地址
//            println(false)
//        }
//
//
//        val bb: Byte = 1
//        val cc: Int = bb.toInt() //低类型不能够显示转化为高类型
//
//        val a1 = 1L + 3   //Long+Int可以显示转化为Long
//

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

        val strs2 = """
            maodayu
            yu
            mao
        """.trimMargin()   //祛除空格
    }

}
