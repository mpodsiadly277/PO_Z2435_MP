import java.io.File

fun wczytajPlik(): List<String> {
    var sciezka = "C:\\Users\\milos\\OneDrive\\Dokumenty\\liczby.txt"
    var plik = File(sciezka)

    return plik.readLines()

}
fun policzsrednia(dane: List<String>): Double
{
    var liczba_elementów = dane.size
    var suma = dane.sumOf { it.toInt() }
    var srednia = (suma.toDouble() / liczba_elementów)
    return srednia
}

fun main() {
    var dane = wczytajPlik()
    var srednia = policzsrednia(dane)

    println("Srednia liczb wynosi: ${policzsrednia(wczytajPlik())}")
    println("Wczytano plik:$dane,\nśrendnia liczb wynosi: $srednia")
    println("Liczba zaokraglona do jednego miejsca po przecinku %.1f".format(srednia))
}