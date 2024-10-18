package com.example.sara_poo_myapplication

open class Vehiculo(var marca: String, var modelo: String) {
    fun mostrarInfo() {
        println("Marca: $marca, Modelo: $modelo")
    }
}

class Coche(marca: String, modelo: String, var puertas: Int) : Vehiculo(marca, modelo) {
    fun mostrarInfoCoche() {
        println("Marca: $marca, Modelo: $modelo, Puertas: $puertas")
    }
}

fun main() {
    val vehiculo = Vehiculo("Toyota", "Corolla")
    vehiculo.mostrarInfo()
    val coche = Coche("Honda", "Civic", 4)
    coche.mostrarInfoCoche()
}

