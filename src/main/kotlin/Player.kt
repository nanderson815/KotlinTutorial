class Player(val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {

    fun show() {
        println("""
            name: $name
            level: $level
            lives: $lives
            score: $score
            """)
    }
}