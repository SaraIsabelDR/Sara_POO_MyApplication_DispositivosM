package com.example.sara_poo_myapplication

class Estudiante(var nombre: String, var edad: Int, var promedio: Double) {

    fun estadoEstudiante() {
        if (promedio >= 6) {
            println("$nombre está Aprobado con un promedio de $promedio")
        } else {
            println("$nombre está Reprobado con un promedio de $promedio")
        }
    }
}

fun main() {
    val estudiante1 = Estudiante("Sara", 18, 8.5)
    estudiante1.estadoEstudiante()

    val estudiante2 = Estudiante("_Leonardo", 21, 5.4)
    estudiante2.estadoEstudiante()
}
