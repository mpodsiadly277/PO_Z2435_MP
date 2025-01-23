public class Circle extends Shape{
    Point center;
    double diameter;
    double radius;

    public Circle(Point center, double diameter) throws BadShapeException {
        this.center = center;
        if (diameter < 1) {
            throw new BadShapeException("Średnica powinna być większa od 1.");
        }
        this.diameter = diameter;
        this.radius = (diameter / 2);
    }

    public Circle(float i) {
        radius = i;
    }

    public double area(){
        return radius * radius * Math.PI;
    }
    double circumference(){
        return radius * 2 * Math.PI;
    }


}
