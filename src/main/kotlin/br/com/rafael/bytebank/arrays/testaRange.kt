package br.com.rafael.bytebank.arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun testaRange() {
    val salarios = doubleArrayOf(1500.0, 3444.5, 2365.6, 6743.2)
    val base = 2000.0
    val topo = 4000.0
    val contador = salarios.count { it in base..topo }
    println(contador)

    val idades = intArrayOf(24, 12, 45, 3, 50)

    println(idades.maxOrNull())
    println(idades.average())
    println(idades.minOrNull())

    val maioresDeIdade = idades.filter { it >= 18 }
    println(maioresDeIdade)

    val saoMaioresDeIdades = idades.all { it >= 18 }
    println(saoMaioresDeIdades)

    val algumMaiorDeIdade = idades.any { it >= 18 }
    println(algumMaiorDeIdade)

    val salariosBigDecimal = bigDecimalArrayOf("1500.00", "1200.00", "5850.00", "2000.00", "9850.00")
    println(salariosBigDecimal.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento = salariosBigDecimal
        .map { salario -> calcularAumentoRelativo(salario, aumento) }
        .toTypedArray()
    println(salariosComAumento.contentToString())
}

fun calcularAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal {
    if (salario < "5000.00".toBigDecimal()) {
        return salario.add("500".toBigDecimal())
    }
    return salario.multiply(aumento).setScale(2, RoundingMode.UP)
}
