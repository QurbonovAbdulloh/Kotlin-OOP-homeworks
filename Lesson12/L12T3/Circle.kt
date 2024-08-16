package Homework12.Task3

import kotlin.math.PI

class Circle {

    var radius: Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    var color: String = ""
        get() = field
        set(value) {
            field = value
        }

    constructor()

    constructor(radius: Double) {
        this.radius = radius
    }

    constructor(radius: Double, color: String) {
        this.radius = radius
        this.color = color
    }

    fun getArea(): Double {
        return PI * (radius * radius)
    }

    override fun toString(): String {
        return "Circle(radius=$radius, color='$color', getArea=${getArea()})"
    }


}