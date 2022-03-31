fun testeCopiaEReferencia() {
    val contaJoao = Conta("Joao", 1000)

    val contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("Titula joao ${contaJoao.titular}")
    println("Titula maria ${contaMaria.titular}")
}