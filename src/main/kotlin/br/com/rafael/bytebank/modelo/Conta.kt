package br.com.rafael.bytebank.modelo

var global: Int = 0
    private set

abstract class Conta(
    var titular: Cliente,
    val conta: Int,
): Autenticavel {
    var saldo = 0.0
        protected set

    companion object {
        var totalConta: Int = 0
    }

    init {
        totalConta++
    }

    override fun autenticar(valor: Int): Boolean {
        return titular.autenticar(valor)
    }

    fun depositar(valor: Double) {
        if (valor > 0.0) {
            saldo += valor
        }
    }

    abstract fun sacar(valor: Double)
}
