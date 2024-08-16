package Homework12.Task2

class Rectangle {

    var length: Float = 0f
    var width: Float = 0f

    constructor()

    constructor(length: Float, width: Float) {
        this.length = length
        this.width = width
    }

    fun getArea(): Double {
        return length.toDouble() * width.toDouble()
    }

    override fun toString(): String {
        return "Rectangle(length=$length, width=$width, getArea=${getArea()})"
    }


}