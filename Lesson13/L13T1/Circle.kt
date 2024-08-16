package Homework.Task1

import kotlin.math.PI

class Circle: Shape {
    var radius: Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    constructor()

    constructor(radius: Double) : super() {
        this.radius = radius
    }

    constructor(color: String, filled: Boolean, radius: Double) : super(color, filled) {
        this.radius = radius
    }


    fun getArea(): Double {
        return PI * radius * radius
    }

    fun getPerimetr(): Double {
        return 2 * PI * radius
    }

    override fun toString(): String {
        return "Circle(radius=$radius), color=$color, filled=$filled"
    }
}
