package br.com.rafael.bytebank.collections

fun testaMap() {
    val pedidos = mutableMapOf(Pair(1, 20.3), Pair(2, 45.6), 3 to 94.7)
    println(pedidos)
    val pedido = pedidos[0]
    pedido?.let {
        println(it)
    }

    for(p: Map.Entry<Int, Double> in pedidos) {
        println("Número do pedido ${p.key}")
        println("Valor do pedido ${p.value}")
    }

    pedidos[4] = 24.5
    println(pedidos)
    pedidos.put(5, 43.2)
    println(pedidos)
    pedidos.put(5, 150.2)
    println(pedidos)
    pedidos.putIfAbsent(6, 50.2)
    println(pedidos)
    pedidos.putIfAbsent(6, 10.0)
    println(pedidos)
    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3, 50.0)
    println(pedidos)

    println("Valor do primeiro pedido ${pedidos.getValue(1)}")

    val sextoPedido = pedidos.getOrElse(6) {
        0.0
    }
    println(sextoPedido)

    val setimoPedido = pedidos.getOrDefault(7, -1.0)
    println(setimoPedido)

    println("Números dos pedidos: ${pedidos.keys}")
    println("Valores dos pedidos: ${pedidos.values}")

    val pedidosPrioritarios = pedidos.filter { (numero, valor) ->
        numero > 3 && valor > 40.0
    }
    println(pedidosPrioritarios)

    val ultimosPedidos = pedidos.filterKeys { numero -> numero > 3 }
    println(ultimosPedidos)

    val menoresPedidos = pedidos.filterValues { valor -> valor < 30.0 }
    println(menoresPedidos)

    println(pedidos + Pair(6, 35.5))
    println(pedidos - 4)

    pedidos.putAll(listOf(Pair(7, 76.6)))
    println(pedidos)

    pedidos += Pair(8, 10.2)
    println(pedidos)

    pedidos -= 8
    println(pedidos)

    pedidos.keys.remove(7)
    println(pedidos)

    pedidos.values.remove(20.3)
    println(pedidos)
}
