package Homework.Task3

class Student: Person {

    var program: String = ""
    get() = field
    set(value) {
        field = value
    }

    var year: Int = 0
    get() = field
    set(value) {
        field = value
    }

    var fee: Double = 0.0
    get() = field
    set(value) {
        field = value
    }

    constructor(name: String, address: String, program: String, year: Int, fee: Double) : super(name, address) {
        this.program = program
        this.year = year
        this.fee = fee
    }

    override fun toString(): String {
        return "Student(Person(name=${name}, address=${address}), program='$program', year=$year, fee=$fee)"
    }


}