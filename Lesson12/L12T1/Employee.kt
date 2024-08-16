package Homework12.Task1

class Employee {

    var id: Int = 0
        get() = field
        set(value) {
            field = value
        }

    var firstName: String = ""
        get() = field
        set(value) {
            field = value
        }

    var lastName: String = ""
        get() = field
        set(value) {
            field = value
        }

    var salary: Int = 0
        get() = field
        set(value) {
            field = value
        }


    constructor(id: Int, firstName: String, lastName: String, salary: Int) {
        this.id = id
        this.firstName = firstName
        this.lastName = lastName
        this.salary = salary
    }

    fun raiseSalary(percent: Int = 10): Int {
        return salary * (percent + 100) / 100
    }

    override fun toString(): String {
        return "Employee(id=$id, firstName='$firstName', lastName='$lastName', salary=$salary, raiseSalary=${raiseSalary()})"
    }


}