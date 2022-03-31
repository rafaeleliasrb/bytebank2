class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double get() = super.bonificacao + salario

    fun autenticar(valor: Int): Boolean {
        if (senha == valor) {
            return true
        }
        return false
    }
}