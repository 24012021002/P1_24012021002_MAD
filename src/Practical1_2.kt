fun main() {
    val a: Int = 100
    val b: Double = a.toDouble()
    println("Integer Value: $a")
    println("Double Value (From Integer): $b")

    val str1: String = "1024"
    val c: Int = str1.toInt()
    val d: Int = Integer.parseInt(str1)
    println("String Value: $str1")
    println("Integer Value1 (From String): $c")
    println("Integer Value2 (From String): $d")

    val str2: String = "98.76"
    val e: Double = str2.toDouble()
    println("String Value: $str2")
    println("Double Value (From String): $e")
}
