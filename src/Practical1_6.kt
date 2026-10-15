fun main() {
    print("Enter First Number: ")
    val n1 = readln().toInt()
    print("Enter Second Number: ")
    val n2 = readln().toInt()

    println("Addition of $n1 and $n2 = ${addition(n1, n2)}")
    println("Subtraction of $n1 and $n2 = ${subtraction(n1, n2)}")
    println("Multiplication of $n1 and $n2 = ${multiplication(n1, n2)}")
    println("Division of $n1 and $n2 = ${division(n1, n2)}")
}

fun addition(n1: Int, n2: Int): Int = n1 + n2
fun subtraction(n1: Int, n2: Int): Int = n1 - n2
fun multiplication(n1: Int, n2: Int): Int = n1 * n2
fun division(n1: Int, n2: Int): Double = n1.toDouble() / n2.toDouble()
