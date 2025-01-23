fun main() {
    println("Wprowadź login: ")
    var login = readLine()!!.trim()

    println("Wprowadź hasło: ")
    var password = readLine()!!.trim()

    while (login != "admin" || password != "admin") {
        println("Login lub hasło niepoprawne")
        println("Wprowadź login: ")
        login = readLine()!!.trim()
        println("Wprowadź hasło: ")
        password = readLine()!!.trim()
    }
        println("Pomyślnie zalogowano")

    println("Ile czasu chcesz odmierzyć?")
    var time = readLine()!!.trim().toInt()

    for (i in time downTo 0) {
        if (i != 0) {
            println(i)
            Thread.sleep(1000)
        } else {
            println("Koniec")
        }
    }

}