fun testaOperacoes() {
    val contaLucio = ContaPoupanca(titular = "Lucio", conta = 1000)
    contaLucio.depositar(10.0)

    val contaFernanda = ContaCorrente(conta = 1001, titular = "Fernanda")
    contaFernanda.depositar(20.0)

    println("Saldo ${contaLucio.titular}: ${contaLucio.saldo}")

    val deposito = 100.0
    contaLucio.depositar(deposito)
    println("Saldo ${contaLucio.titular} apos depósito de $deposito: ${contaLucio.saldo}")

    val saque = 50.0
    contaLucio.sacar(saque)
    println("Saldo ${contaLucio.titular} apos saque de $saque: ${contaLucio.saldo}")

    val tranferencia = 10.0
    if (contaLucio.tranferir(tranferencia, contaFernanda)) {
        println("Valor transferido com sucesso")
    } else {
        println("Falha na transaferência")
    }

    println("Saldo final ${contaLucio.titular}: ${contaLucio.saldo}")
    println("Saldo final ${contaFernanda.titular}: ${contaFernanda.saldo}")
}