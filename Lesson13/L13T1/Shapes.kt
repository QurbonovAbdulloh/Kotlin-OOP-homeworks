package Homework.Task1

fun main() {

    val shape = Shape("white", true)

    val circle = Circle(5.0)

    val circle2 = Circle("black", true, 4.0)

    val rectangle = Rectangle(4.0, 5.0)

    val rectangle2 = Rectangle("yellow", true, 5.0, 7.0)

    val square = Square(2.0)

    println(shape)
    println(circle)
    println(circle2)
    println(rectangle)
    println(rectangle2)
    println(square)

}

