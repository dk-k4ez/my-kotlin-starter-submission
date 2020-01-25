fun main() {

    // TODO 1
    val user = mapOf<String, String>("name" to "John",
                                    "age" to "23",
                                    "address" to "St. Petersbug")

    // TODO 2
    val name = user.getValue("name")
    val age = user.getValue("age")
    val address = user.getValue("address")

    // TODO 3
    fun print(name : String, age : String, address : String) : String = """User
    |Name: $name
    |Age: $age
    |Address: $address
    """.trimMargin()
    
    println(print(name, age, address))

}