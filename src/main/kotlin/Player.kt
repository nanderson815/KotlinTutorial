class Player(val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {
    var weapon: Weapon = Weapon("Fist", 1)
    private val inventory = ArrayList<Loot>()

    fun show() {
        if (lives > 0) {
            println("$name is alive")
        } else {
            println("$name is dead")
        }
    }

    override fun toString(): String {
        return ("""
            name: $name
            level: $level
            lives: $lives
            score: $score
            Weapon:
            $weapon
            """)
    }

    fun getLoot(item: Loot) {
        inventory.add(item)
    }

    fun dropLoot(item: Loot): Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    fun dropLoot(name: String): Boolean {
        println("$name will be dropped.")
        for (item in inventory){
            if (item.name == name){
                inventory.remove(item)
                return true
            }
        }
        return false
    }


    fun showInventory() {
        println("=====================================")
        println("$name's Inventory")
        var total = 0.0
        for (item in inventory) {
            println(item)
            println("----------------")
            total += item.value
        }
        println("=====================================")
        println("Total score is $total")
    }
}