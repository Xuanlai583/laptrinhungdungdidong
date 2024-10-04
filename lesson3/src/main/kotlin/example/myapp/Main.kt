package example.myapp

fun buildAquarium() {
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    println("Volume: ${aquarium6.width * aquarium6.height * aquarium6.height/ 1000} liter")
}



    fun main() {
    buildAquarium()
}