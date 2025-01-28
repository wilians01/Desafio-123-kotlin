package Desafios

fun main() {
    // Solicita o preço do litro da gasolina
    print("Informe o preço do litro da gasolina: ")
    val precoPorLitro = readLine()?.toDoubleOrNull()

    // Solicita o valor que o motorista deseja pagar
    print("Informe o valor do pagamento: ")
    val valorPagamento = readLine()?.toDoubleOrNull()

    if (precoPorLitro != null && precoPorLitro > 0 && valorPagamento != null && valorPagamento > 0) {
        // Calcula a quantidade de litros abastecida
        val litros = valorPagamento / precoPorLitro

        // Exibe o resultado
        println("Você conseguiu colocar %.2f litros de gasolina.".format(litros))
    } else {
        println("Valores inválidos. Certifique-se de informar números positivos.")
    }
}
