package kotlin

import Animal
import Hippo
import Vet
import Wolf

fun main(args: Array<String>) {

    val wolf = Wolf()
    wolf.makeNoise()
    wolf.roam()
    wolf.sleep()

    val animal: Animal = Wolf()
    animal.eat()

    val hippo = Hippo()

    val vet = Vet()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}