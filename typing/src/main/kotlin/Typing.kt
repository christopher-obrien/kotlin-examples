package types

fun main() {

    val employee = Employee("John", "Doe", Department.ENGINEERING)
    println(personalizedHello(employee.name)) // unchecked exception
    println("John's ID: ${employee.hashCode()}")

    val contractor = Contractor("Sally", "Smith", "ACME")

    val workers = arrayOf(employee, contractor)
    workers.map {
        when (it) { //auto casting! works with IFs as well
            is Contractor -> "${it.name} is from ${it.company}"
            is Employee -> "${it.name} works in ${it.department}"
            else -> throw IllegalArgumentException("Not valid person!")
        }
    }.forEach{println(it)}
}

//functions expect non-null variables
@Throws(IllegalArgumentException::class)
fun personalizedHello(name: String): String {
    if(name.none())
        throw IllegalArgumentException("Name not populated!")
    return "Hello $name"
}

