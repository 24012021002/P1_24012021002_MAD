import java.util.Arrays

fun main() {
    val a1 = arrayOf(10, 90, 60, 80, 100)
    println("Create Array-1 by using arrayOf() method:")
    println(Arrays.deepToString(a1))

    val a2 = Array<Int>(5) { 0 }
    println("Create Array-2 by using Array<>():")
    println(a2.contentDeepToString())

    val a3 = Array<Int>(8) { i -> i }
    println("Create Array-3 by using Array<>() and lambda function:")
    println(a3.contentDeepToString())

    val a4 = IntArray(5) { 0 }
    println("Create Array-4 by using IntArray():")
    println(a4.joinToString(", "))

    val a5 = intArrayOf(12, 10, 1, 5, 18, 19)
    println("Create Array-5 by using intArrayOf():")
    println(a5.joinToString(", "))

    val a6 = arrayOf(intArrayOf(1, 3), intArrayOf(4, 5), intArrayOf(6, 7))
    println("Create 2D Array-6 by using arrayOf() and intArrayOf():")
    println(a6.contentDeepToString())

    println("\nPlease enter 5 Array Values:")
    val a = IntArray(5)
    for (i in 0 until a.size) {
        print("a[$i] = ")
        a[i] = readln().toInt()
    }
    println("Entered Array:")
    println(a.joinToString(", ", "[", "]"))

    print("Using Range (..): ")
    for (i in 0..a.size - 1) {
        print("${a[i]} ")
    }
    println()

    print("Using downTo: ")
    for (i in a.size - 1 downTo 0) {
        print("${a[i]} ")
    }
    println()

    print("Using until: ")
    for (i in 0 until a.size) {
        print("${a[i]} ")
    }
    println()

    println("\n************* With Built-in Function *************")
    val sortedBuiltIn = a.sortedArray()
    println("After sorting by built-in function:")
    println(sortedBuiltIn.joinToString(", "))

    println("\n************* Without Built-in Function *************")
    val b = a.copyOf()
    println("Before Sorting:")
    println(b.joinToString(", "))
    for (i in 0 until b.size) {
        for (j in i + 1 until b.size) {
            if (b[i] > b[j]) {
                val temp = b[i]
                b[i] = b[j]
                b[j] = temp
            }
        }
    }
    println("After Sorting without built-in function:")
    println(b.joinToString(", "))
}
