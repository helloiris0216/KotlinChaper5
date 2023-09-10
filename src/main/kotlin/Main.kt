fun main(args: Array<String>) {

    val animal: Animal = Wolf()
    animal.eat()


    val wolf = Wolf()
    val hippo = Hippo()

    val vet = Vet()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}