fun main(args: Array<String>) {
    println("Hello World!")

    val titular = "Pedro"
    val numeroConta = 1000
    var saldo = 0.0

    saldo = 100 + 2.0
    saldo += 200
    saldo -= 1000

    println("Titular: ${titular}")
    println("numer de conta: ${numeroConta}")
    println("saldo: ${saldo}")

   testaCodicao(saldo)
    estruturaLoop(titular,numeroConta,saldo)
}

fun estruturaLoop(titular: String, numeroConta: Int, saldo: Double){

    for(i in 5 downTo 1){ // ainda existe a opcao do step que funciona para andar de tantos em tantos index

        if(i == 4){
            continue //break
        }

        val tit = "${titular} $i"
        val num = 1000 +i
        val sald = i + 10.0

        println("Titular: ${tit}")
        println("conta: ${num}")
        println("saldo: ${sald}")
    }


    var x = 0;
    while(x < 5){

        val tit = "${titular} $x"
        val num = 1000 +x
        val sald = x + 10.0

        println("Titular: ${tit}")
        println("conta: ${num}")
        println("saldo: ${sald}")

        x++
    }
}

fun testaCodicao(saldo: Double){
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}