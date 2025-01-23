import java.util.Scanner;
fun main() {
    var scan = Scanner(System.`in`)
    println("Czy odrobiłeś już lekcje? - jeśli tak wpisz true, jeśli nie wpisz false.")
    var lekcje = scan.nextBoolean()
    if (lekcje == true) {
        println("Możesz wyjść na boisko.")
    } else {
        println("Nie możesz wyjść, najpierw odrób lekcje.")
    }
    print("Teraz zrobimy januszowy sposób na naprawę czegokolwiek")
    println("Czy coś się rusza?")

    var rusza: String = scan.next().toUpperCase().trim()
    var powinno: String

    if (rusza == "NIE") {
        println("A powinno?")
        powinno = scan.next().toUpperCase().trim()
        if (powinno == "NIE") {
            println("Po problemie!")
        }
        else {
            println("WD-40 i po problemie!")
        }
    } else {
        println("A powinnno?")
        powinno = scan.next().toUpperCase().trim()
        if (powinno == "NIE") {
            println("Taśma i po problemie!")
        }
        else {
            println("Po problemie!")
        }

    }
}