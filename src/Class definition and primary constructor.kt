fun main(args: Array<String>) {

    var student = Student("Mayank", 23)
    println(student.id)

}

class Student(var name: String) {

    var id: Int = -1

    init {
        println("My name is $name")
    }

    constructor(n: String, id: Int) : this(n) {
        //The body of the Secondary constructor is called after the init block
        this.id = id
    }
}