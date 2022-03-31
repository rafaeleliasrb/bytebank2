class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double get() = super.bonificacao + salario + plr

    fun autenticar(valor: Int): Boolean {
        if (senha == valor) {
            return true
        }
        return false
    }
}