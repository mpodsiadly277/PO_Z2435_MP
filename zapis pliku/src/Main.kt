import java.io.File
import java.nio.charset.Charset

fun Wczytajplik(): List<String> {
    var sciezka = "C:\\Users\\milos\\OneDrive\\Dokumenty\\liczb.txt"
    var plik = File(sciezka)

    return plik.readLines()
}

fun tablica_z_pliku(Liczby: List<String>): ArrayList<Int>
{
    var tablica = arrayListOf<Int>()
    
    for (i in Liczby)
    {
        tablica.add(i.toInt())
    }
    return tablica
}
fun policzSumeLiczb(dane: ArrayList<Int>): Int
{
    var suma = 0
    for (i in dane)
    {
        suma += i
    }
    return suma
}

fun zapis(wynik:Int)
{
    var sciezka = "C:\\Users\\milos\\OneDrive\\Dokumenty\\wynik.txt"
    var plik = File(sciezka)
    plik.writeText(wynik.toString(), Charset.defaultCharset())

}


fun main(args: Array<String>) {
    /*rozne rodzaje tablic
    var tablica: IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    var tablicaInt2 = Array(6, { i -> i })
    var tablicaInt3 = arrayOf(7,8,9,10)
    var TablicaMonster = Array (1000, {0})
    */
    var dane = Wczytajplik()
    var tablicaArrayList = tablica_z_pliku(dane)
    var suma = policzSumeLiczb(tablicaArrayList)
    println(suma)
    zapis(suma)
}
}