package br.com.rafael.bytebank.arrays

import java.math.BigDecimal
import java.math.RoundingMode


fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {
    return Array(values.size) { values[it].toBigDecimal() }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acc, value ->
        acc + value
    }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        somatoria().divide(this.size.toBigDecimal(), 2, RoundingMode.UP)
    }
}