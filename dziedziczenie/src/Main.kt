open class Postać(imie: String)
{

    var imie = imie
    var hp = 100
    var sila = 10
    var inteligencja = 10
    var kondycja = 10
    var zrecznosc = 10
    var bystrosc = 10

    fun atakuj(postac: Postać) {
        println("Zadałeś obrażenia przeciwnikowi ${postac.imie}, obrazenia wyniosly: ${postac.sila}")
    }

    fun uzyjPotki()
    {
        println("Przywrociłes 10 hp")
    }
}
class Mag(imie:String) : Postać(imie)
{
    var mana = 100

    fun rzucMagie(postac:Postać)
    {
        mana -= 20
        println("Rzuciłes magie na ${postac.imie}, zadałeś obrażenia magiczne: ${inteligencja *2}")
    }
}

class Wojownik(imie: String) : Postać(imie)
{
    var wytrzymalosc = 100

    fun uzyjBroni(postac: Postać)
    {
        println("Zadałeś obrażenia fizyczne przeciwnikowi ${postac.imie}, obrazenia wyniosly: ${sila*2}")
        wytrzymalosc -= 10
    }

}


fun main() {
    var Malzachar = Mag("Malzachar")
    var Artur = Wojownik("Artur")
    Malzachar.rzucMagie(Artur)
    Artur.uzyjBroni(Malzachar)
}