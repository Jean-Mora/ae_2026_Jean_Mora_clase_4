//  ae_2026_Jean_Mora_clase_4 main.kt
//estructura del commit clase_4 {{valor incremental}}
data class Student(
    val id: Long,
    val name: String,
    val email: String,
    val grade: Int,
    val isActive: Boolean
)

fun main() {
    val jorge = Student(
        name = "jorge",
        email = "jorge@puce.com",
        grade = 8,
        id = 1,
        isActive = true
     
    )
    
    val ana = Student(1, "Ana", "ana@puce.com",10,true)
    println(jorge)
}