package br.com.rafael.bytebank.teste

fun testaCondicional(saldo: Double) {
    if (saldo > 10) {
        println("Saldo positivo")
    } else if (saldo == 0.0) {
        println("Saldo zerado")
    } else {
        println("Saldo negativo")
    }

    when {
        saldo > 10 -> println("Saldo positivo")
        saldo == 0.0 -> println("Saldo zerado")
        else -> println("Saldo negativo")
    }
}