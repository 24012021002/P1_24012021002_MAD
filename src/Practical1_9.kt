fun main() {
    val numbers = ArrayList<Int>()
    print("Enter number of elements in ArrayList: ")
    val n = readln().toInt()

    for (i in 0 until n) {
        print("numbers[$i] = ")
        numbers.add(readln().toInt())
    }

    println("ArrayList Elements: $numbers")

    var maxNum = numbers[0]
    for (num in numbers) {
        if (num > maxNum) {
            maxNum = num
        }
    }

    println("Largest element = $maxNum")
}
