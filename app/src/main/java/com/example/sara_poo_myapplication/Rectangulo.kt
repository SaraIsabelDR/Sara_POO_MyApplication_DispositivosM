package com.example.sara_poo_myapplication

class Rectangulo(var base: Double, var altura: Double) {
    fun area(): Double {
        return base * altura
    }

    fun perimetro(): Double {
        return 2 * (base + altura)
    }
}

fun main() {
    val rectangulo = Rectangulo(5.0, 8.9)
    println("Area: ${rectangulo.area()}")
    println("Perimetro: ${rectangulo.perimetro()}")
}
