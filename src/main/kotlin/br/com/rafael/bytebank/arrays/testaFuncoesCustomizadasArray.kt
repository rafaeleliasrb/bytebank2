package br.com.rafael.bytebank.arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun testaFuncoesCustomizadasArray() {
    val salarios = bigDecimalArrayOf("3000.0", "1400.0", "4500.00", "8600.00", "1250.0")

    val somaDosSalarios = salarios.somatoria()
    println(somaDosSalarios)

    val meses = 6.toBigDecimal()
    val salariosEm6Meses = salarios.fold(BigDecimal.ZERO) { acc, salario ->
        acc + salario.multiply(meses).setScale(2, RoundingMode.UP)
    }
    println(salariosEm6Meses)

    val media3Maiores = salarios
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()

    println(media3Maiores)

    val media3Menores = salarios
        .sorted()
        .take(3)
        .toTypedArray()
        .media()

    println(media3Menores)
}