package Homework.Task2

fun main() {

    val circle = Circle()
    circle.radius = 10.0
    circle.color = "black"
    println(circle)

    val cylinder = Cylinder()
    cylinder.radius = 5.0
    /*circle.height = 5   ---> 'height' esimdan chiqibti:)*/
    cylinder.color = "red"
    println(cylinder)
}