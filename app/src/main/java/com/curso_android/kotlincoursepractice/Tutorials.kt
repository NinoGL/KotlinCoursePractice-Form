package com.curso_android.kotlincoursepractice

fun main(){

/*
    //VARIABLES, IMPRESION
    var myVariable: Int = 5 //Las variables deben inicializarse sino no compila.
    println("The value of my variable is: $myVariable")
    var myFloat: Float = 4F //A los Float se los aclara con la F (SIEMPRE)
    var myDouble: Double = 4.0 //Los Double sin NINGUNA LETRA

    val x: Int = 5; val y: Int = 17; val z: Int = x + y
    println("The result is: ${x + y} " )
    println("The result is: " + z )

    //CONSTANTES
    val myFinalType: String = "Hola" //Declaración de una CONSTANTE
    println(myFinalType)
   */
    /*
    //COMPARACION STRINGS
    val string: String = "h"
    var string2: String = "H"
    println(string == string2)
    println(string === string2) //Referential comparing
    println(string.equals(string2))
    println(string.equals(string2,true))
    */
    /*
    IF
    val num1 = 7
    val num2 = 7
    val resultado = if (num1 + num2 == 14) 3 else 4
     */

    /*
    val userInput = readLine() //Devuelve solo Strings! Y permite que no se ingrese nada y que userInput = null
    println("You entered: ${userInput?.uppercase()}") /* El ? verifica que no sea null.
    Si no lo es, entonces convertirá a mayúsculas */
    */

    /*
    //ARRAYS, BUCLE WHILE
    val myArray = arrayOf(3, 2, "H", 4, 4.2F) //Pueden mezclarse distintos tipos pero NO hacerlo
    val dimension = myArray.size
    var i = 0
    while (i < dimension){
        println(myArray[i])
        i++
    }
     */
    /*
    //BUCLE FOR
    val myArray2 = arrayOf(1, 2, 3)
    for (i in myArray2){ //For Each en Java
        println(i)
    }

    for (i in 1..10){ //Iterar un rango de números con un 'for each'
        print("$i ")
    }
    println(" ")
    for (i in 10 downTo 4 step 2) {
        print("$i ")
    }
    println(" ")
    for (i in 'a'..'z'){
        print("$i ")
    }

    */
    /*
    //LISTAS
    val array = arrayOf(1,2,3) //Pueden cambiar sus valores pero no su dimensión
    val list = mutableListOf(1,2,3) // Pueden cambiar sus valores y también su dimensión. No se pueden mezclar tipos de datos

    list.add(4)
    list.remove(1) //Elimina el valor 1
    list.removeAt(2) // Elimina el índice 2

    var fibonacciList = mutableListOf(0,1)

    var numberEntered = readLine()?.toInt()

    while( numberEntered == null){
            println("Debe ingresar un valor ")
            numberEntered = readLine()?.toInt()
    }
    var sum = 0

    for (i in 2 until numberEntered-1){
        sum = fibonacciList[i-1]+fibonacciList[i-2]
        fibonacciList.add(sum)
    }
    println(fibonacciList)
    */
    /*
    //WHEN

    var age = readLine()?.toInt()

    when(age){ // Es el Switch en Java
        in 0..5 -> println("El rango contiene los extremos")
        in 6..17 ->println("El rango contiene los extremos")
        18 -> println("Entra solo si es 18")
        19,20 -> println("Entra solo si es 19 o 20")
        else -> println("Cagón!")
    }
    */
    /*
    //Funciones
    printThreeLines()
    println(printPow(2,8))
    println(sum(2,2))
    printFirst()
     */
    /*
    //VARARG
    println(getMax(1,2,3,4,5,6,7,8,9,10))
    */
    /*
    //Funcions extensions
    println("Please enter a number:")
    val input = readLine()?.toInt()
    if (input != null) {
        println("Is the number $input a prime number? Answer: ${input.isPrime()}")
    }
    */
    /*
    val rectangle = Rectangle(4,7)
    println(rectangle.toString())
    println("Area: ${rectangle.area()}")
    val rectangle2 = Rectangle(5.0) //Creo cuadrado a través de un secondary constructor
    val randomRectangle = Rectangle.randomRectangle()
    println(randomRectangle.toString())
    */
    /*
    //ANONYMUS CLASS
    val a = 3.0
    val b = 4.0
    val height = 2.0

    val customShape = object: Shape("Nino",a,b,height){
        init {
            println("Parallelogram created a = $a, b = $b and height = $height")
            println("Th area id ${area()}")
            println("The perimeter is ${perimeter()}")
        }

        override fun area(): Double {
            return a*height
        }

        override fun perimeter(): Double {
            return a*2 + b*2
        }

        override fun toString(): String {
            return super.toString()
        }
    }

    println(customShape.toString())
    */

}
    fun printThreeLines(){
        println("First")
        println("Second")
        println("Third")

    }

    fun printPow(base: Int, exponent: Int): Int{
        println(Math.pow(base.toDouble(),exponent.toDouble()))
        return base
    }

    fun sum(number1 : Int,number2 : Int) : Int = (number1 + number2)
    fun printFirst() = println("First")

    fun getMax(vararg numbers: Int): Int{
        var max = numbers[0]
        for (number in numbers){
            if (number > max){
                max = number
            }
        }
        return max
    }

    fun Int.isPrime(): Boolean{
        var booleanReturn: Boolean = true;
        for (i in 2 until this-1){
            if (this % i == 0){
                booleanReturn = false;
                break
            }
        }
        return booleanReturn
    }

