fun main(args: Array<String>) {

    var person = Indian()
    println(person.name)
}

abstract class Person {

    abstract var name:String    //Abstract variable with no body

    abstract fun eat()           //Abstract method with no body
    open fun getHeight() {}
    fun goToSchool() {}
}

class Indian: Person() {

    override var name:String = "my_dummy_Indian"   //Overriding Abstract variable

    override fun eat() {       //Overriding Abstract method

    }

    override fun getHeight()
    {
        // our own code
    }
}