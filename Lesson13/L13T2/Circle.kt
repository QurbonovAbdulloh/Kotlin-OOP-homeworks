package Homework.Task2

import kotlin.math.PI

open class Circle {
    var radius: Double = 0.0
        get() = field

    var color: String = ""
        get() = field

    open fun getArea(): Double {
        return PI * radius * radius
    }

    override fun toString(): String {
        return "Circle[(radius=$radius, color='$color', areaCircle=${getArea()})]"
    }
}