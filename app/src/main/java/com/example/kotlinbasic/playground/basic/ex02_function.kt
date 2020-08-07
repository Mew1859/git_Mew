package com.example.kotlinbasic.playground.basic

fun main(){
    normalFuntion()
    argumentFunction(1150,112)
    println(returnFunction1())
    println(returnFunction2())
    println(returnFuction3(112,10))
    optionalFuction(112)
    optionalFuction(x2 = 112,x1 = 500)

    //Lambda Expression
    val  lambdal1 : (Int, Int)->Int={x1, x2 ->x1+x2}//-> =return
    println(lambdal1(1150,112))

    val  lambdal2  ={x1:Int,x2:Int->x1+x2}
    println(lambdal2(1150,112))

    //with out lambda
    fun xxx(x1: Int,x2: Int):Int{
        return x1+x2
    }

}fun normalFuntion(){
     println("normalFunction")
}
fun  argumentFunction(x1 :Int,x2 :Int){
    println("sum: $x1 +$x2")
    println("sum: ${x1+ x2}")
}
fun returnFunction1():String{
    return "iBlurBlur"
}
fun returnFunction2()="iBlurBlur"
fun returnFuction3(x1: Int,x2: Int)=x1+x2
fun optionalFuction(x1: Int,x2: Int=0){
    println("sum: ${x1+x2}")
}