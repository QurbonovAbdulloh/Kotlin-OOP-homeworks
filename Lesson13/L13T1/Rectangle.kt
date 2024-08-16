package Homework.Task1

open class Rectangle: Shape {

    var width: Double = 0.0
    get() = field
    set(value) {
        field = value
    }

    var length: Double = 0.0
    get() = field
    set(value) {
        field = value
    }

    constructor()

    constructor(width: Double, length: Double) : super() {
        this.width = width
        this.length = length
    }

    constructor(color: String, filled: Boolean, width: Double, length: Double) : super(color, filled) {
        this.width = width
        this.length = length
    }

    fun getArea(): Double {
        return width * length
    }

    fun getPerimetr(): Double {
        return 2 * (width + length)
    }

    override fun toString(): String {
        return "Rectangle(width=$width, length=$length, color=$color, filled=$filled)"
    }
}