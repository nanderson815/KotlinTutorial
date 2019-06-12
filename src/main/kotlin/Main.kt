fun main(args: Array<String>) {

//    val uglyTroll = Troll("Ugly Troll")
//    println(uglyTroll)
//    uglyTroll.takeDamage(46)
//    println(uglyTroll)
//
//    val vlad = Vampire("Vlad")
//    println(vlad)
//    vlad.takeDamage(8)
//    println(vlad)
//
//    val dracula = VampireKing("Dracula")
//    println(dracula)

//    while (dracula.lives > 0) {
//        if (dracula.doudges()){
//            continue
//        }
//        if (dracula.runAway()) {
//            println("Dracula ran away.")
//            break
//        } else {
//            dracula.takeDamage(12)
//        }
//    }

    val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOR, 183.0))
    conan.getLoot(Loot("Ring of Speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Cursed Shield", LootType.ARMOR, -8.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOR, 1.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 4.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION, 42.0))
    conan.showInventory()

}