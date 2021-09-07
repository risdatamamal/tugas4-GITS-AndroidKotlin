
fun main() {
    car()
}

// Merupakan kelas car
fun car() {
    val carList = arrayListOf("BMW", "Mercedes Benz", "Lamborgini", "Ferrari", "Mazda")

    // Perulangan menggunakan forEach
    carList.forEach {
        println("Aku memiliki mobil: $it")
    }

    /* carList.forEach {
        println("Aku memiliki mobil: $it")
    }
     */
}

