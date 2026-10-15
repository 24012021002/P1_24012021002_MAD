fun main() {
    print("Student Enrolment No.: ")
    val enrollNo = readln()

    print("Student Name: ")
    val name = readln()

    print("Student Branch: ")
    val branch = readln()

    print("Student Class: ")
    val className = readln()

    print("Student Batch: ")
    val batch = readln()

    print("Student College Name: ")
    val collegeName = readln()

    print("Student University Name: ")
    val universityName = readln()

    print("Student Age: ")
    val age = readln().toInt()

    println("\n*******************")
    println("Student's Data:")
    println("Enrolment No.: $enrollNo")
    println("Name: $name")
    println("Age: $age")
    println("Branch: $branch")
    println("Class: $className")
    println("Batch: $batch")
    println("College Name: $collegeName")
    println("University Name: $universityName")
}
