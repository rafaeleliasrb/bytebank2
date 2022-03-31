class Conta(
    var titular: String,
    val conta: Int
) {
    var saldo = 0.0
        private set

    fun depositar(valor: Double) {
        if (valor > 0.0) {
            saldo += valor
        }
    }

    fun sacar(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun tranferir(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.depositar(valor)
            return true
        }
        return false
    }
}