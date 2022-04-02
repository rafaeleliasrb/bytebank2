fun main() {
    println("Hello World!")

    val contaCorrente = ContaCorrente(
        titular = "Lucio",
        conta = 1000,
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fernanda",
        conta = 1001,
    )

    contaCorrente.depositar(valor = 1000.0)
    contaPoupanca.depositar(valor = 1000.0)

    contaCorrente.sacar(valor = 100.0)
    contaPoupanca.sacar(valor = 100.0)

    println("Saldo conta corrente após saque: ${contaCorrente.saldo}")
    println("Saldo conta poupança após saque: ${contaPoupanca.saldo}")

    contaCorrente.tranferir(valor = 100.0, destino = contaPoupanca)

    println("Saldo conta corrente após transferir: ${contaCorrente.saldo}")
    println("Saldo conta poupança após receber transferência: ${contaPoupanca.saldo}")
}


