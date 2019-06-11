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

    val redPotion = Loot("Red Potion", LootType.POTION,7.50)
    tim.getLoot(redPotion)

    val chestArmor = Loot("Chest Armor", LootType.ARMOR, 80.00)
    tim.getLoot(chestArmor)

    tim.showInventory()

    tim.getLoot(Loot("Ring of Protection", LootType.RING, 40.25))
    tim.getLoot(Loot("Invisibility Potion", LootType.POTION, 35.95))
    tim.showInventory()

    if(tim.dropLoot(redPotion)){
        tim.showInventory()
    } else {
        println("You don't have a ${redPotion.name}")
    }

    val bluePotion = Loot("Blue Potion", LootType.POTION, 6.00)

    if (tim.dropLoot((bluePotion))){
        tim.showInventory()
    } else {
        println("You don't have ${bluePotion.name}")
    }

    tim.dropLoot("Invisibility Potion")

    tim.showInventory()

}