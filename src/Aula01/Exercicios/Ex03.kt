package Aula01.Exercicios

fun main(){
    print("Digite um número: ")
    var num: Int? = readLine()?.toIntOrNull()

    if (num != null) {
        if(num % 2 == 0){
            println("Par.")
        } else {
            println("Impar.")
        }
    } else {
        println("Nulo.")
    }
}