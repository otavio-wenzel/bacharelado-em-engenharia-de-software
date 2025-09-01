package com.example.aula_01

fun main() {

    // Solicitar as notas das três provas
    println("Digite a nota da primeira prova:")
    val nota1 = readln().toDouble()

    println("Digite a nota da segunda prova:")
    val nota2 = readln().toDouble()

    println("Digite a nota da terceira prova:")
    val nota3 = readln().toDouble()

    // Calcular a média
    val media = (nota1 + nota2 + nota3) / 3

    // Verificar se o aluno foi aprovado ou reprovado
    if (media >= 7.0) {
        println("Aprovado com média: $media")
    } else {
        println("Reprovado com média: $media")
    }
}