package Homework.Task3

open class Person {

    var name: String = ""
    get() = field
    set(value) {
        field = value
    }

    var address: String = ""
    get() = field
    set(value) {
        field = value
    }

    constructor(name: String, address: String) {
        this.name = name
        this.address = address
    }


}