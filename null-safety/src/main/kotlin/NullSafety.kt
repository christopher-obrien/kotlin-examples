package nulls

fun main() {

    var a = "John"
//  a = null // can't do this
    var b: String? = "abc"
    b = null

    println(a.length)
//  println(b.length) // can't do this either not null safe
    println(b?.length)

    println(personalizedHello(a))
//  println(personalizedHello(b))  // can't do because String? is not String
    try {
        println(personalizedHello(b!!)) // still can't enter due to NPE
    } catch (e: NullPointerException) {
        println("Got NullPointerException!")
    }
    println(personalizedHello(b ?: "Nobody"))

}

//functions expect non-null variables
fun personalizedHello(name: String): String {
    return "Hello $name"
}

