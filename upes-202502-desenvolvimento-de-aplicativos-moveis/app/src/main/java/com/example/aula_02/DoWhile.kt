package com.example.aula_02

fun main() {

    //A estrutura do-while é semelhante ao while, mas garante que o bloco de código seja
    // executado pelo menos uma vez, pois a condição é verificada após a execução.

    var numero = 0

    do {
        println("Número: $numero")
        numero++
    } while (numero < 3)

}