import javax.swing.text.BadLocationException;

public class Point {
    double x, y, a, b;

    public Point(double x, double y) throws BadShapeException {
        this.x = x;
        this.y = y;
        if(x<0 || y<0)
            throw new BadShapeTwoException("Wskaż punkty x oraz y większe od 0 ");
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}
