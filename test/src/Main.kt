import java.util.Scanner;

fun main() {

    var scan = Scanner(System.`in`)
    print("Wprowadz swoje imie: ")
    var imie = scan.nextLine()
    print("Wprowadz swoj wiek: ")
    var wiek = scan.nextInt()

    println("Witaj $imie, masz $wiek lat i to już czas nauczyć się programować")
    println("Teraz czas na wykonanie kilku działań matematycznych!")

    print("Podaj pierwsza liczbe: ")
    var liczba1 = scan.nextInt()
    print("Podaj druga liczbe: ")
    var liczba2 = scan.nextInt()
    var dodawanie = liczba1 + liczba2
    var odejmowanie = liczba1 - liczba2
    var mnozenie = liczba1 * liczba2
    var dzielenie = liczba1 / liczba2
    println("$liczba1 + $liczba2 = $dodawanie")
    println("$liczba1 - $liczba2 = $odejmowanie")
    println("$liczba1 * $liczba2 = $mnozenie")
    println("$liczba1 / $liczba2 = $dzielenie")

    println("Czy otrzymane wyniki cię satysfakcjonują?")
    var odp = scan.next().toUpperCase().trim()

    if (odp == "TAK") {
        println("Dziekujemy za pomoc!")
    }
    else if (odp == "NIE") {
        println("Powiedz mi co jeszcze mogłem zrobic!")
        var odp2 = scan.next()
    }
}




