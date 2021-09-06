fun main() {
    car()
}

fun car() {
    val carList = arrayListOf("BMW", "Mercedes Benz", "Lamborgini", "Ferrari", "Mazda")
    carList.forEach {
        println("Aku memiliki mobil: $it")
    }
}

