abstract class Conta(
    var titular: String,
    val conta: Int,
) {
    var saldo = 0.0
        protected set

    fun depositar(valor: Double) {
        if (valor > 0.0) {
            saldo += valor
        }
    }

    abstract fun sacar(valor: Double)
}
