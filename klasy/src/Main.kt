class Pies(waga:Int, glos:Int)
{
    var waga = waga
    var glos = glos
}
fun kto_wygra(pies1: Pies, pies2: Pies)
{
    if (pies1.glos > pies2.glos)
        println("Pies numer 1 wygrywa")
    if (pies1.glos < pies2.glos)
        println("Pies numer 2 wygrywa")
    if (pies1.glos == pies2.glos)
        println("Burki warczą tak samo!")
}


fun main(vargs:Array<String>)
{
    var Reksio = Pies(10, 9)
    var Burek = Pies(15, 9)

    kto_wygra(Reksio, Burek)

}
