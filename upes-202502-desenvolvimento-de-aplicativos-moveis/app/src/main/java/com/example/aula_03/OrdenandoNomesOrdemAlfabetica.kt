package com.example.aula_03

fun main() {

    // Array para armazenar os nomes
    val nomes = arrayOf("Beatriz", "Ana", "Carlos", "Pedro", "Juliana")

    // Ordenando os nomes em ordem alfabética
    val nomesOrdenados = nomes.sortedArray()

    // Exibindo os nomes ordenados
    println("Nomes em ordem alfabética:")
    nomesOrdenados.forEach { println(it) }
}