fun main(args: Array<String>) {

    var dog = Dog()
    var cat = Cat()

    dog.name = "Ralph"
    dog.breed = "corgi"
    println("My dogs name is ${dog.name}, he is a ${dog.breed} & ${dog.color} in color")
    dog.bark()
    dog.eat()

    cat.name = "MangoBrown"
    cat.age = 16
    println("\nMy cats name is ${cat.name}, he is ${cat.age} years old & ${cat.color} in color")
    cat.meow()
    cat.eat()


}

open class Animal {

    var name: String = ""
    open var color: String = "White"

    open fun eat() {
        println("Animal is Eating")
    }
}

class Dog : Animal() {

    var breed: String = ""
    override var color: String = "Peach"   //Overriding Variable

    fun bark() {
        println("bowbow ;_;")
    }

    override fun eat() {                   //Overriding Method
        super<Animal>.eat()
        println("Dog is Eating")
    }
}

class Cat : Animal() {


    var age: Int = -1
    override var color: String = "Black"   //Overriding Variable

    fun meow() {
        println("Meowwwww ;_;")
    }

    override fun eat() {                   //Overriding Method
        super<Animal>.eat()
        println("Cat is Eating")
    }
}