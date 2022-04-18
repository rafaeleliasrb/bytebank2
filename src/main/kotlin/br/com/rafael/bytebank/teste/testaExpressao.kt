package br.com.rafael.bytebank.teste

fun testaExpressao() {
    val entrada: String = "1"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido * 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("Valor com taxa: $valorComTaxa")
    } else {
        println("Valor inválido")
    }
}
