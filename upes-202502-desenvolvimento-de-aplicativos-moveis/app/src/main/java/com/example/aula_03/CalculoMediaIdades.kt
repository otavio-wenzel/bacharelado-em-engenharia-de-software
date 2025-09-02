package com.example.aula_03

fun main() {

    // Criação do array para armazenar as idades
    val idades = arrayOf(15, 16, 17, 18, 19)

    // Soma das idades
    val soma = idades.sum()

    // Cálculo da média
    val media = soma / idades.size

    // Exibindo a média
    println("A média das idades é: $media")
}