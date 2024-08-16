package Homework.Task2

import kotlin.math.PI
import kotlin.math.pow

class Cylinder: Circle() {
    var height: Int = 0
    get() = field

    fun getVolume(): Double {
        return 2 * PI * radius
    }

    override fun getArea(): Double {
        return getVolume() * height * PI * radius.pow(2)
    }

    override fun toString(): String {
        return "Cylinder [${Circle().toString()}, height=$height, areCylinder=${getArea()}"
    }
}