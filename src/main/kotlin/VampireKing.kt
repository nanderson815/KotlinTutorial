import java.util.*

class VampireKing(name: String) : Vampire(name) {
    init {
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }

    fun runAway(): Boolean {
        return lives < 2
    }

    fun doudges(): Boolean {
        val rand = Random()
        val chance = rand.nextInt(6)
        return if (chance > 3){
            println("Dracula dodges")
            true
        } else {
            false
        }
    }
}