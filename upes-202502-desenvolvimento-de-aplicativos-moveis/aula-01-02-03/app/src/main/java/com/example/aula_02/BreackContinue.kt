package com.example.aula_02

fun main() {

    //O comando break interrompe o laço de repetição imediatamente, saindo do loop.

    for (i in 1..10) {
        if (i == 5) {
            break  // Interrompe o loop quando i for 5
        }
        println(i)
    }

    //O comando continue pula a iteração atual do laço e continua com a próxima.

    for (i in 1..5) {
        if (i == 3) {
            continue  // Pula a iteração quando i for 3
        }
        println(i)
    }

    //Use break e continue com moderação, pois podem tornar o fluxo do programa mais difícil de entender.
    //Prefira usar estruturas claras de controle para evitar dependência excessiva desses comandos.

}