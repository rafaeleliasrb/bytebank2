class ContaCorrente(
    titular: String,
    conta: Int,
) : ContaAvancada(
    titular = titular,
    conta = conta,
) {
    override fun sacar(valor: Double) {
        val valorComTaxa = valor + valor * 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}
