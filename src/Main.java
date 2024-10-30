public class Main {
    public static void main(String[] args) {

            Point a = new Point(0.0, 0.0);
            Point b = new Point(3, 4);

        Calculator calculator = new Calculator();
        Circle circle = new Circle(a,7);

        System.out.println("Odległość między punktami a i b: " + calculator.distance(a, b));
        System.out.println("Odległość między punktami a i b w osi X: " + calculator.distanceX(a, b));
        System.out.println("Odległość między punktami a i b w osi Y: " + calculator.distanceY(a, b));
        System.out.println("Pole koła = " + circle.area());
        System.out.println("Obwód kola = " + circle.circumference());

        Shape square = new Square(4);
        Shape triangle = new Triangle(6);

        System.out.println("Pole okręgu: " + circle.area());
        System.out.println("Pole kwadratu: " + square.area());
        System.out.println("Pole trójkąta: " + triangle.area());
        System.out.println("Suma pól okręgu i kwadratu: " + Calculator.AreaSum(circle, square));
    }
}