package com.example.aula_02

fun main() {

    //A estrutura if em Kotlin funciona da mesma forma que em outras linguagens, permitindo que
    // você execute blocos de código com base em uma condição.

    val numero = 10

    if (numero > 0) {
        println("O número é positivo")
    } else if (numero < 0) {
        println("O número é negativo")
    } else {
        println("O número é zero")
    }

    //Em Kotlin, if pode ser usado como uma expressão, o que significa que ele pode retornar um
    // valor. Isso permite atribuir o resultado diretamente a uma variável.

    val num = 5
    val resultado = if (num % 2 == 0) "Par" else "Ímpar"
    println(resultado)  // Saída: Ímpar

    //Utilize if como uma expressão quando possível para evitar blocos de código desnecessários.
    //Sempre cubra todos os casos possíveis usando else para garantir que todas as condições
    // sejam tratadas.

}