package br.com.rafael.bytebank.functions

import br.com.rafael.bytebank.modelo.Endereco

fun testaTipoFuncao() {
    val tipoFuncaoReferencia = ::soma
    println(tipoFuncaoReferencia(2, 3))

    val tipoFuncaoClasse = Teste()
    println(tipoFuncaoClasse(2, 3))

    val tipoFuncaoLambda = { a: Int, b: Int -> a + b }
    println(tipoFuncaoLambda(2, 3))

    val tipoFuncaoFuncaoAnonima = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(tipoFuncaoFuncaoAnonima(2, 3))

    val tipoFuncaoBonificacaoLambda = lambda@{ salario: Double ->
        if (salario > 1000.0) {
            return@lambda salario + 50.0
        }
        return@lambda salario + 100.0
    }
    println(tipoFuncaoBonificacaoLambda(1000.0))

    val tipoFuncaoBonificacaoFuncaoAnonima = fun(salario: Double): Double {
        if (salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.0
    }
    println(tipoFuncaoBonificacaoFuncaoAnonima(1000.0))

}

fun soma(a: Int, b: Int): Int = a + b

class Teste : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int = p1 + p2
}
