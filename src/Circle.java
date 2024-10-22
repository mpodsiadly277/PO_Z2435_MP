public class Circle {
    Point center;
    double diameter;
    double radius;

    public Circle(Point center, double diameter) {
        this.center = center;
        this.diameter = diameter;
        this.radius = (diameter / 2);
    }
    double area(){
        return radius * radius * Math.PI;
    }
    double circumference(){
        return radius * 2 * Math.PI;
    }


}
