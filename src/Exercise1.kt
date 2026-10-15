fun main() {
    println("With using third variable:")
    var a = 10
    var b = 20
    println("Before Swapping:")
    println("The value of a is:$a and Value of b is:$b")

    val temp = a
    a = b
    b = temp
    println("After Swapping:")
    println("The value of a is:$a and Value of b is:$b")

    println("\n***********************\n")

    println("Without using third variable:")
    var x = 10
    var y = 20
    println("Before Swapping:")
    println("The value of x is:$x and Value of y is:$y")

    x = x + y
    y = x - y
    x = x - y
    println("After Swapping:")
    println("The value of x is:$x and Value of y is:$y")
}
