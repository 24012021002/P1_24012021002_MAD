fun main() {
    print("Enter any number: ")
    val number = readln().toInt()
    println("Factorial of $number = ${factorial(number)}")
    println("By TailRec Keyword, Factorial of $number = ${tailrecFactorial(number)}")
}

fun factorial(n: Int): Long {
    return if (n <= 1) 1L else n * factorial(n - 1)
}

tailrec fun tailrecFactorial(n: Int, accumulator: Long = 1L): Long {
    return if (n <= 1) accumulator else tailrecFactorial(n - 1, accumulator * n)
}
