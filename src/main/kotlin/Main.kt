fun main(Args: Array<String>) {
//    val lives = 3
//
//    var isGameOver = (lives < 1)
//    println(isGameOver)
//
//    if (isGameOver) {
//        println("Game over!")
//    } else {
//        println("You're still alive!")
//    }

    println("How old are you?: ")
    val age = readLine()!!.toInt()
    println("Age is: $age")

    val message: String
    message = when {
        age < 18 -> "You're too young to vote."
        age == 100 -> "Dang you are old."
        else -> "You are old enough to vote."
    }

    println(message)

}