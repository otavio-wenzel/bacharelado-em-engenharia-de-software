package com.example.aula_01

fun main() {

    var soma = 0

    // Somar todos os números de 1 a 100
    for (i in 1..100) {
        soma += i
    }

    println("A soma dos números de 1 a 100 é: $soma")
}