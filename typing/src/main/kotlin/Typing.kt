package types

fun main() {

    val employee = Employee("John", "Doe", Department.ENGINEERING)
    println(personalizedHello(employee.name)) // unchecked exception
    println("John's ID: ${employee.hashCode()}")

    val contractor = Contractor("Sally", "Smith", "ACME")

    val workers = arrayOf(employee, contractor)
    workers.forEach {
        //auto casting! works with IFs as well
        when (it) {
            is Contractor -> println("${it.name} is from ${it.company}")
            is Employee -> println("${it.name} works in ${it.department}")
        }
    }

}

//functions expect non-null variables
@Throws(IllegalArgumentException::class)
fun personalizedHello(name: String): String {
    if(name.none())
        throw IllegalArgumentException("Name not populated!")
    return "Hello $name"
}

