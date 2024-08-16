package Homework12.Task3

fun main() {

    val circle = Circle()
    circle.radius = 2.0
    circle.color = "green"
    println(circle)

    val circle2 = Circle(3.0)
    circle.color = "black"
    println(circle2)

    val circle3 = Circle(4.0, "white")
    println(circle2)

    println(Circle(6.0, "yellow"))
}