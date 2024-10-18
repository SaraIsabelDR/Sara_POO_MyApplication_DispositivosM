package com.example.sara_poo_myapplication

class Persona(var nombre: String, var edad: Int) {
    fun presentarse() {
        println("Hola, mi nombre es $nombre y tengo $edad años")
    }
}

fun main() {
    val persona = Persona("Sara", 18)
    persona.presentarse()
}
