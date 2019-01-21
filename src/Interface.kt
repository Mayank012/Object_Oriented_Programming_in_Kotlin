fun main(args: Array<String>) {

    var btn = Button()
    btn.onClick()
    btn.onTouch()

}

interface MyFirstInterface {     // you cannot create instance of interface

    fun onTouch()      // Methods in interface are abstract by default

    fun onClick() {   // Normal methods are public and open in nature and NOT FINAL
        println("MyFirstInterface: onClick")
    }
}

interface MySecondInterface {     // you cannot create instance of interface

    fun onTouch() {     // Normal method
        println("MySecondInterface: onTouch")
    }

    fun onClick() {   // Normal methods are public and open in nature and NOT FINAL
        println("MySecondInterface: onClick")
    }
}

class Button : MyFirstInterface, MySecondInterface {
    override fun onClick() {
        super<MyFirstInterface>.onClick()
        super<MySecondInterface>.onClick()
    }

    override fun onTouch() {
        super.onTouch()
    }


}