package br.com.rafael.bytebank.arrays

fun testaArrays() {
    val idades: IntArray = intArrayOf(10, 34, 56)
    var menorIdade: Int = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println(menorIdade)

    val salarios: DoubleArray = doubleArrayOf(1000.5, 3040.5, 10345.6)
    val aumento = 1.1
    for (index in salarios.indices) {
        salarios[index] = salarios[index] * aumento
    }

    println(salarios.contentToString())

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * aumento
    }

    println(salarios.contentToString())
}