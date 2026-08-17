package Aula01.Exercicios

fun main(){
    print("Valor em graus Celsius: ")
    var temp: Double = readln().toDouble()
    print("1 - Farenheit\n2 - Kelvin\n:")
    var opt: Int = readln().toInt()

    if(opt == 1){
        println("${(temp * 9 / 5) +32}°F")
    } else if (opt == 2){
        println("${temp + 273.15}°K")
    } else {
        println("Erro.")
    }
}