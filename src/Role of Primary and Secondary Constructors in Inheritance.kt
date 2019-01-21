fun main(args: Array<String>) {
    var animal = dog("blacky", "pug")

}
// Using Primary Constructor
//open class animals(var color: String) {     //Super Class
//
//    init {
//        println("From animal init: $color")
//    }
//
//}
//
//class dog(color: String, var breed: String) : animals(color) {   //Derived Class
//
//    init {
//        println("From dog init: $color and $breed")
//    }
//}

// Using Secondary Constructor
open class animals {     //Super Class
    var color: String = ""

    constructor(color: String) {
        this.color = color

        println("From Animal: $color")
    }
}

class dog : animals {   //Derived Class
    var breed: String = ""

    constructor(color: String, breed: String) : super(color) {
        this.breed = breed

        println("From Dog: $color and $breed")
    }
}
