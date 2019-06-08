fun main(args: Array<String>){
    println("Hello World!")
    println("My first Kotlin Program!")

    var noah = "Noah Anderson"
    println("The name of our employee is $noah")

    var noahWeeklySalary: Int = 200
    var noahMonthlySalary: Int = noahWeeklySalary * 4
    println("$noah's monthly salary is $$noahMonthlySalary")

    println()

    val apples: Int = 6
    val oranges: Double = 5.0
    var fruit: Double = (apples + oranges)
    println("The total amount of apples and oranges is $fruit")

    val weeks = 234
    val years: Double = weeks / 52.0

    println("$weeks weeks is $years years. ")

}