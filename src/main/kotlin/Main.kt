fun main(args: Array<String>) {

    val wolf = Wolf()
    val hippo = Hippo()

    val vet = Vet()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}