class ContaPoupanca(
    titular: String,
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
