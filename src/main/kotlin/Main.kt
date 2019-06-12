fun main(args: Array<String>) {




    val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOR, 183.0))
    conan.getLoot(Loot("Ring of Speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Cursed Shield", LootType.ARMOR, -8.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOR, 1.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 4.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION, 42.0))
    conan.showInventory()

    conan.dropLoot("Gold Ring")
    conan.showInventory()

}