public class Calculator {
    double deltaX, deltaY;

    public double distance(Point a, Point b) {
    double deltaX = a.x - b.x;
    double deltaY = a.y - b.y;
    return Math.sqrt (deltaX * deltaX + deltaY * deltaY);
    }
    public double distanceX(Point a, Point b) {
        return Math.abs(a.x - b.x);
    }
    public double distanceY(Point a, Point b) {
        return Math.abs(a.y - b.y);
    }
}
