package Desafios

fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite a segunda nota: ")
    val nota2 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite a terceira nota: ")
    val nota3 = readLine()?.toDoubleOrNull() ?: 0.0

    val peso1 = 1
    val peso2 = 2
    val peso3 = 3

    val mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3)

    println("A média ponderada é: %.2f".format(mediaPonderada))
}
