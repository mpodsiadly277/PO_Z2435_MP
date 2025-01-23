public class Main {
    public static void main(String[] args) {

        Point a = new Point(40, 3);
        Point b = new Point(5, 4);

        Calculator calculator = new Calculator();
        
        System.out.println("Odległość między a i b: " + calculator.distance(a, b));
        System.out.println("Odległość w osi X między a i b: " + calculator.distanceX(a, b));
        System.out.println("Odległość w osi Y między a i b: " + calculator.distanceY(a, b));

        Circle circle = new Circle(a, 4);
        System.out.println("Pole koła: " + circle.area());
        System.out.println("Obwód koła: " + circle.circumference());
    }
}
