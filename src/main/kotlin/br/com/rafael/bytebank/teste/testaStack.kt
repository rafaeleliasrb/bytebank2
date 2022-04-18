package br.com.rafael.bytebank.teste

fun funcao1() {
    println("Inicio funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        e.printStackTrace()
        println("ClasCastException foi pega")
    }
    println("Fim funcao1")
}

fun funcao2() {
    println("Inicio funcao2")
    for (i in 1..5) {
        println(i)
        var endereco = Any()
        throw ClassCastException()
    }
    println("Fim funcao2")
}