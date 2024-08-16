package Homework.Task1

open class Shape {
    var color: String = ""
        get() = field
        set(value) {
            field = value
        }

    var filled: Boolean = false
        get() = field
        set(value) {
            field = value
        }

    constructor()

    constructor(color: String, filled: Boolean) {
        this.color = color
        this.filled = filled
    }
    override fun toString(): String {
        return "Shape(color='$color', filled=$filled)"
    }
}