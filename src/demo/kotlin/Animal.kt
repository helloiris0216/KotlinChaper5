open class Animal {

//    val image = ""
//    val food = ""
//    val habitat = ""
//    val hunger = 10
//
//    fun makeNoise() {
//
//        println("The Animal is making a noise")
//    }
//
//    fun eat() {
//
//        println("The Animal is eating")
//    }
//
//    fun roam() {
//
//        println("The Animal is roaming")
//    }
//
//    fun sleep() {
//
//        println("The Animal is sleeping")
//    }

    open val image = ""
    open val food = ""
    open val habitat = ""
    val hunger = 10

    open fun makeNoise() {

        println("The Animal is making a noise")
    }

    open fun eat() {

        println("The Animal is eating")
    }

    open fun roam() {

        println("The Animal is roaming")
    }

    fun sleep() {

        println("The Animal is sleeping")
    }
}