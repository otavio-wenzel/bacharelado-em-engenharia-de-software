package com.example.sistemapedidosrestaurante

fun main() {
    val cliente = Cliente("João", 0.1)
    val pedido = Pedido(cliente)

    pedido.adicionarItem(Item("Hamburguer", 20.0))
    pedido.adicionarItem(Item("Batata Frita", 10.0))

    println("Total do pedido: ${pedido.calcularTotal()}")
}

class Item(val nome: String, val preco: Double)

class Cliente(val nome: String, val cupomDesconto: Double = 0.0)

