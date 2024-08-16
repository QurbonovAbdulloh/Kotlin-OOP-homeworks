package Homework.Task3

class Staff: Person {

    var school: String = ""
    get() = field
    set(value) {
        field = value
    }

    var pay: Double = 0.0
    get() = field
    set(value) {
        field = value
    }

    constructor(name: String, address: String, school: String, pay: Double) : super(name, address) {
        this.school = school
        this.pay = pay
    }

    override fun toString(): String {
        return "Staff(Person(name=${name}, address=${address}), school='$school', pay=$pay)"
    }


}