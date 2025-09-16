package com.example.aula_01

fun main() {

    // Solicitar o número ao usuário
    println("Digite um número:")
    val numero = readln().toInt()

    // Verificar se o número é par ou ímpar usando o operador %
    if (numero % 2 == 0) {
        println("O número $numero é par.")
    } else {
        println("O número $numero é ímpar.")
    }
}