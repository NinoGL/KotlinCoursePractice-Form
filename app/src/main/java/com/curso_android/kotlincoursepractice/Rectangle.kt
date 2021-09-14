package com.curso_android.kotlincoursepractice

import kotlin.random.Random

class Rectangle( //Primary constructor: SOLO SE PONENE LAS PROPIEDADES
    private var x: Double,
    private var y: Double
    ) : Shape("Rectangle") //Calling primary and secondary constructor of Shape class
{

    companion object{ //Sinónimo de static method en Java
        fun randomRectangle(): Rectangle{
            var x = Random.nextDouble(1.0, 10.0)
            var y =  Random.nextDouble(1.0,10.0)
            return (Rectangle(x,y))
        }
    }
    constructor(x: Double) : this(x, x) // Secondary constructor for a square must calle the first with : this(x,x)
    constructor(x: Int, y: Int) : this(x.toDouble(), y.toDouble()) //Otr Secondary constructor

    init{ //block initializer, se ejecutan con el primary constructor
        println("Rectangle con nombre ${name.uppercase()} created with x: $x and y: $y")
    }

    override fun area(): Double = this.x*this.y
    //Función que se hereda de la superclase, declarada como abstract en esta última. Poner OVERRIDE

    override fun perimeter(): Double {
        return (x*2 + y*2) * ImportanNumbers.PI/ImportanNumbers.PI
    }

    override fun toString(): String {
        return "Rectangle(x=$x, y=$y)"
    }

    fun toString(number : Int): String { //Overload de funciones: No debe coincidir el número de parametros
        return "Rectangle(x=$x, y=$y)"
    }


}