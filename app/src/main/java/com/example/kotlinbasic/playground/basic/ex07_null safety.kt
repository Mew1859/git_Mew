package com.example.kotlinbasic.playground.basic

fun main(){
 //var null1: String =null
    var null2: String?=null
    """
    if(null2 != null){
        println(null2.length)
    }
    """
    println(null2?.length)
    null2 = "Buchit"
    println(null2?.length)

    //Elvis opeator
    var null3 = null2 ?:"cat"
    """
        if(null2 != null){
        null3 = null2
        }else{
        null3 = "cat"
        }"""

  null2?.let {
    //todo
}
if (null2 == null){
    //todo
}
}
class Demonull{
    lateinit var name : String
    var name2 : String? = null
}
