package com.example.aula_02

fun main() {

    //A estrutura for em Kotlin é usada para iterar sobre coleções, intervalos, ou arrays de
    // uma maneira concisa e eficiente.

    for (i in 1..5) {
        println(i)  // Saída: 1, 2, 3, 4, 5
    }

    //in: Utilizado para iterar dentro de um intervalo ou uma coleção.
    //O intervalo 1..5 significa "de 1 até 5".

    val frutas = arrayOf("Maçã", "Banana", "Cereja")

    for (fruta in frutas) {
        println(fruta)
    }

}