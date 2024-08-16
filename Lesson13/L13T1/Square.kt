package Homework.Task1

class Square : Rectangle {
    var side: Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    constructor(side: Double) : super() {
        this.side = side
    }

    constructor(width: Double, length: Double, side: Double) : super(width, length) {
        this.side = side
    }

    constructor(color: String, filled: Boolean, width: Double, length: Double, side: Double) : super(
        color,
        filled,
        width,
        length
    ) {
        this.side = side
    }

    override fun toString(): String {
        return "Square(side=$side)"
    }
}