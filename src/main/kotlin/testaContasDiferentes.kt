fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Lucio",
        conta = 1000,
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fernanda",
        conta = 1001,
    )

    val contaSalario = ContaSalario(
        titular = "Joao",
        conta = 1002,
    )

    contaCorrente.depositar(valor = 1000.0)
    contaPoupanca.depositar(valor = 1000.0)
    contaSalario.depositar(valor = 1000.0)

    contaCorrente.sacar(valor = 100.0)
    contaPoupanca.sacar(valor = 100.0)
    contaSalario.sacar(valor = 100.0)

    println("Saldo conta corrente após saque: ${contaCorrente.saldo}")
    println("Saldo conta poupança após saque: ${contaPoupanca.saldo}")
    println("Saldo conta salário após saque: ${contaSalario.saldo}")

    contaCorrente.tranferir(valor = 100.0, destino = contaPoupanca)

    println("Saldo conta corrente após transferir: ${contaCorrente.saldo}")
    println("Saldo conta poupança após receber transferência: ${contaPoupanca.saldo}")

    contaCorrente.tranferir(valor = 100.0, destino = contaSalario)

    println("Saldo conta corrente após transferir: ${contaCorrente.saldo}")
    println("Saldo conta salário após receber transferência: ${contaSalario.saldo}")
}