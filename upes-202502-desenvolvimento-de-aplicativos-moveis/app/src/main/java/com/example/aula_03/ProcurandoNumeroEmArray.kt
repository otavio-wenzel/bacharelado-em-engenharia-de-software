package com.example.aula_03

fun main() {

    // Array de números inteiros
    val numeros = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Solicitando ao usuário o número a ser procurado
    println("Digite o número que deseja procurar:")
    val numero = readln().toInt()

    // Verificando se o número está presente no array
    if (numero in numeros) {
        println("O número $numero está presente no array.")
    } else {
        println("O número $numero não foi encontrado no array.")
    }
}