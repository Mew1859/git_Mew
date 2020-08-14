package com.example.kotlinbasic.playground.basic

fun main() {
//list set map
    val list1 = mutableListOf("111", 123, true)
    val list2 = mutableListOf<Any>("122", 123, true)
    val list3 = mutableListOf<Int>(123, 456, 789)
    val list4: MutableList<Int> = mutableListOf(123, 456, 789)
    val list5 = mutableListOf<Any>()
    val list6 = mutableListOf<Int>()
    val list7: MutableList<Int> = mutableListOf()
    list1.add("iBlur")
    for (item in list1){
        print("$item")
    }
    println()

    //fixed size (Immutable) read-only
    val list8 = listOf("111",123,true)
    val list9 = listOf<Any>("111",123,true)
    val list10 = listOf<Int>(123,456,888)
    val list11 : List<Int> = listOf(123,55,555)
    val list12 = listOf<Any>()
    val list13 = listOf<Int>()
    val iist14 : List<Int> = listOf()
    //extension
    val listExtension = mutableListOf<Int>(123,455,777)
    println("sum: ${listExtension.sum()}")
    println("sumby: ${listExtension.sumBy { item -> item }}")
    println("in 1234: ${1234 in listExtension} ")//search
    println("in 123: ${123 in listExtension} ")//search
    println("all >100: ${listExtension.all { item -> item > 100 }}")
    println("all >=100: ${listExtension.any { item -> item >=5000 }}")
    println("none =1111: ${listExtension.none { item -> item == 1111 }}")
    println("all =123: ${listExtension.none { item -> item ==123 }}")
}
