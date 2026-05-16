//  ae_2026_Jean_Mora_clase_4 main.kt
//estructura del commit clase_4 {{valor incremental}}

data class Student(
    val id: Long,
    val name: String,
    val email: String,
    val grade: Int,
    val isActive: Boolean
)

fun getStudents(): List<Student> {
    val jorge = Student(
        id = 1,
        name = "jorge",
        email = "jorge@puce.com",
        grade = 8,
        isActive = true
    )

    val pedro = Student(
        id = 2,
        name = "pedro",
        email = "pedro@puce.com",
        grade = 6,
        isActive = true
    )

    val juan = Student(
        id = 3,
        name = "juan",
        email = "juan@puce.com",
        grade = 9,
        isActive = true
    )

    return listOf(jorge, pedro, juan)
}

fun getResult(grade: Int): String {
    return if (grade > 7) "Aprobado" else "Reprobado"
}

fun main() {
    for (student in getStudents()) {
        println("${student.name} está ${getResult(student.grade)}")
    }
}