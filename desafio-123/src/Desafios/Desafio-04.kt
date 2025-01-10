package Desafios

fun main() {

    var A = 5
    var B = 10


    println("Antes da troca: A = $A, B = $B")


    A = B.also { B = A }
    //Chamada da função also
    //B.also { B = A } significa :
    //Pegue o valor atual de B (que é 10) e temporariamente guarde-o para ser usado depois.
    // Enquanto isso, execute o código dentro das chaves {B = A}.

    println("Depois da troca: A = $A, B = $B")


}