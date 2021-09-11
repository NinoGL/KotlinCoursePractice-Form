package com.curso_android.kotlincoursepractice

fun main(){
    var myVariable: Int = 5 //Las variables deben inicializarse sino no compila.
    println("The value of my variable is: $myVariable")
    var myFloat: Float = 4F //A los Float se los aclara con la F (SIEMPRE)
    var myDouble: Double = 4.0 //Los Double sin NINGUNA LETRA

    val myFinalType: String = "Hola" //Declaración de una CONSTANTE
    println(myFinalType)

    val x: Int = 5; val y: Int = 17
    val z: Int = x + y
    println("The result is: ${x + y} " )
    println("The result is: " + z )

}