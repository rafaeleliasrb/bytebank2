package br.com.rafael.bytebank.modelo

class ContaPoupanca(
    titular: Cliente,
    conta: Int,
) : ContaAvancada(
    titular = titular,
    conta = conta,
) {
    override fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}
