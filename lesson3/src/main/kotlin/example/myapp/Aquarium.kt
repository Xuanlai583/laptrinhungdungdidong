package example.myapp

class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
    init {
        println("aquarium initiatalizing")
    }
    init{
        // 1 líter = 1000 cm^3
        println("Volume: ${width * height * length / 1000} liter")
    }

    constructor (numberOfFish: Int ) : this() {
        //2000 cm^3 per fish + extra room so water doesn't spill
        var tank = numberOfFish * 2000 * 1.1
            // calculate  the height  needed
        height = (tank/(length * width)).toInt()
    }
    var width: Int = width
    var height: Int = height
    var length: Int = length

    fun printSize() {
        println("Width: $width cm"
                + " height: $height cm"
                + " length: $length cm ")
    }
}