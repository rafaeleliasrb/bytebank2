package br.com.rafael.bytebank.modelo

abstract class ContaAvancada(
    titular: Cliente,
    conta: Int,
) : Conta(
    titular = titular,
    conta = conta,
) {
    fun tranferir(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.depositar(valor)
            return true
        }
        return false
    }
}
