package com.kotlin_day1

class Person constructor(name: String, age: Int) {

    var name: String = name
    var age: Int = age


    var sex: Int = 1
        set
        get

    var height: Double = 172.2
        get() = field
        set(value) {
            if (value > 170)
                field=171.1
            else
                field = 170.1
        }


    var money: Int = 1000
        private set
        get

    init {
        println("name is $name")
    }


    fun printTest(){
        println("this is fun")
    }

    protected fun toastTest(){

    }


    constructor(person: Person) : this("mdy",20)




    //嵌套类
    class Teacher{

        constructor()

        constructor(worker:String)

        constructor(home:Int)
        fun learn():Int=2

        fun score()=10
    }

    //内部嵌套类  使用inner修饰
    inner class Inner{

        fun inner_test(){
            println("inner is class")
        }
    }




}