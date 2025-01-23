public class Calculator {

    public float distance(Point a, Point b) {
        float deltaX = a.getX() - b.getX();
        float deltaY = a.getY() - b.getY();
        return (float) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public float distanceX(Point a, Point b) {
        return Math.abs(a.getX() - b.getX());
    }

    public float distanceY(Point a, Point b) {
        return Math.abs(a.getY() - b.getY());
    }

}
