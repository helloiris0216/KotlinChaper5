
import Animal
import Hippo
import Vet
import Wolf

fun main(args: Array<String>) {

    val wolf = Wolf()
    wolf.makeNoise()
    wolf.roam()
    wolf.sleep()

    // p.34
    val hippo = Hippo()

    val vet = Vet()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}