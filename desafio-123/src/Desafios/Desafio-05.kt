package Desafios

fun main() {
    // Entrada: custo de fábrica do automóvel
    print("Digite o custo de fábrica do automóvel: R$ ")
    val custoFabrica = readLine()?.toDoubleOrNull() ?: 0.0

    // Cálculos
    val porcentagemRevendedor = custoFabrica * 0.25
    val impostos = custoFabrica * 0.45
    val precoFinal = custoFabrica + porcentagemRevendedor + impostos

    // Saída
    println("O preço final do automóvel ao consumidor é: R$ %.2f".format(precoFinal))
}

