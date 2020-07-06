package types

interface Named {
    val name: String
}

interface Person : Named {
    val firstName: String
    val lastName: String

    override val name: String get() = "$firstName $lastName"
}

data class Employee(
        // implementing 'name' is not required
        override val firstName: String,
        override val lastName: String,
        val department: Department
) : Person

data class Contractor(
        override val firstName: String,
        override val lastName: String,
        val company: String
) : Person