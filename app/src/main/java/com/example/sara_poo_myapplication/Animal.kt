package com.example.sara_poo_myapplication


open class Animal(var nombre: String) {
    open fun hacerSonido() {
        println("El animal hace un sonido")
    }
}
class Perro(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("¡Guau!")
    }
}

fun main() {
    val animal = Animal("Perro")
    val perro = Perro("Max")

    animal.hacerSonido()
    perro.hacerSonido()
}
