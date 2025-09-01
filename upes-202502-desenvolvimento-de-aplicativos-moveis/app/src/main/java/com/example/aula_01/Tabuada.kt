package com.example.aula_01

fun main() {

    // Solicitar o número ao usuário
    println("Digite um número para ver sua tabuada:")
    val numero = readln().toInt()

    // Exibir a tabuada de 1 a 10
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}