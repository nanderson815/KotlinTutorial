fun main(args: Array<String>) {
    val tim = Player("Tim")
    tim.show()

    val louise = Player("Louise", 5)
    louise.show()

    val henry = Player("Henry", 4, 8)
    henry.show()

    val ryan = Player("Ryan", 2, 5, 1000)
    ryan.show()

    val axe = Weapon("Axe", 12)
    ryan.weapon = axe
    println(ryan.weapon.name)

    axe.damageInflicted = 24
    println(axe.damageInflicted)

    ryan.show()

    val sword = Weapon("Sword", 10)

    tim.weapon = sword
    ryan.weapon = tim.weapon

    val spear = Weapon("Spear", 14)
    tim.weapon = spear
    tim.show()
    ryan.show()

}