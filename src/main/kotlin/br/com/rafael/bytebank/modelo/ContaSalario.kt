package br.com.rafael.bytebank.modelo

class ContaSalario(
    titular: Cliente,
    conta: Int,
) : Conta(
    titular = titular,
    conta = conta,
) {
    override fun sacar(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}
