package com.example.aula_03

fun main() {

    // Array para armazenar as temperaturas
    val temperaturas = arrayOf(30.0, 32.5, 28.7, 31.0, 29.8, 34.2, 33.1)

    // Encontrando a temperatura máxima e mínima
    val maxTemp = temperaturas.maxOrNull()
    val minTemp = temperaturas.minOrNull()

    // Exibindo os resultados
    println("Temperatura máxima: $maxTemp")
    println("Temperatura mínima: $minTemp")
}