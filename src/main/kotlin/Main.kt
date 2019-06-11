fun main(args: Array<String>) {
    val tim = Player("Tim")
    tim.show()

    val louise = Player("Louise", 5)
    louise.show()

    val henry = Player("Henry", 4,8)
    henry.show()

    val ryan = Player("Ryan", 2,5,1000)
    ryan.show()

    val axe = Weapon("Axe", 12)
    ryan.weapon = axe
    println(ryan.weapon.name)

    axe.damageInflicted = 24
    println(axe.damageInflicted)

    println(ryan.weapon.damageInflicted)

    tim.weapon = Weapon("Sword", 10)
    println(tim.weapon.name)
}