package com.example.aula_03

fun main() {

    // Solicitando o nome e a letra ao usuário
    println("Digite seu nome:")
    val nome = readln()

    println("Digite a letra que deseja contar:")
    val letra = readln()[0]

    // Contando quantas vezes a letra aparece no nome
    val contagem = nome.count { it == letra }

    // Exibindo o resultado
    println("A letra '$letra' aparece $contagem vezes no nome $nome.")
}