package br.com.rafael.bytebank.modelo

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int,
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
), Autenticavel {
    override fun autenticar(valor: Int): Boolean {
        if (senha == valor) {
            return true
        }
        return false
    }
}