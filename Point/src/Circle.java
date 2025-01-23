public class Circle {
    private Point srodek;
    private float srednica;

    // Konstruktor, gdzie podajemy punkt (środek) i średnicę
    public Circle(Point srodek, float srednica) {
        this.srodek = srodek;
        this.srednica = srednica / 2;
    }

    // Oblicza pole koła
    public double area() {
        return Math.PI * srednica * srednica;
    }

    // Oblicza obwód koła
    public double circumference() {
        return 2 * Math.PI * srednica;
    }
}
