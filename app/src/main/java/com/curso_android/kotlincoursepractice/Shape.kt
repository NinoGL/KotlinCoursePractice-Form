package com.curso_android.kotlincoursepractice

abstract class Shape( //open class Shape --> El open haría que no sea FINAL
    protected var name: String
) {
    constructor(name: String, vararg dimensions : Double) : this(name)

    init {
        println("I am the super class!")
    }

    abstract fun area(): Double //Con Abstract obligo a las hijas a implementar la función
    abstract fun perimeter(): Double

    fun changeName(newName: String){
        this.name = newName
    }

    override fun toString(): String {
        return "Shape(name='$name')"
    }


}