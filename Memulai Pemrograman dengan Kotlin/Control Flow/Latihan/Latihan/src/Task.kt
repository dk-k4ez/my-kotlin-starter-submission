fun main() {
    val listNumber = 1.rangeTo(30)

    for (number in listNumber) {
        // TODO 1
        if (number % 2 == 0) continue

        // TODO 2
        if (number > 30) break

        // TODO 3
        var result = number * (number+2)
        println("result is $result")
    }
}