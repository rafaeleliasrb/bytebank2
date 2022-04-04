class ContaPoupanca(
    titular: String,
    conta: Int,
) : Conta(titular = titular,
    conta = conta,
) {
    override fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}