open class Person(
    var firstName: String,
    var lastName: String,
    var age: Int
) {
    constructor(firstName: String, lastName: String) : this(firstName, lastName, 18)

    open fun displayInfo() {
        println("Name: $firstName $lastName")
        println("Age: $age")
    }
}

class Student(
    firstName: String,
    lastName: String,
    age: Int,
    var enrollmentNo: String,
    var branch: String,
    var className: String,
    var labBatch: String
) : Person(firstName, lastName, age) {

    constructor(
        firstName: String,
        lastName: String,
        enrollmentNo: String,
        branch: String
    ) : this(firstName, lastName, 20, enrollmentNo, branch, "CE-A", "AB1")

    override fun displayInfo() {
        super.displayInfo()
        println("Enrollment No: $enrollmentNo")
        println("Branch: $branch")
        println("Class: $className")
        println("Lab Batch: $labBatch")
        println("-----------------------------------------")
    }
}

fun main() {
    val students = ArrayList<Student>()

    students.add(Student("Anand", "Chauhan", 20, "24012021002", "CE", "3CE-A", "A1"))
    students.add(Student("Rahul", "Sharma", 21, "24012021003", "IT", "3IT-B", "B2"))
    students.add(Student("Priya", "Desai", 19, "24012021004", "CSE", "3CSE-A", "A2"))
    students.add(Student("Karan", "Mehta", "24012021005", "CE"))
    students.add(Student("Neha", "Joshi", 20, "24012021006", "AI-DS", "3AIDS-A", "C1"))

    println("========== List of 5 Students ==========")
    for ((index, student) in students.withIndex()) {
        println("Student #${index + 1}:")
        student.displayInfo()
    }
}
