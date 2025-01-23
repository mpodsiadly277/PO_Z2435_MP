public class Triangle extends Shape {
public double side;

public Triangle(double side) {
    this.side = side;
   //  if (side = String)
}

public double area() {
    return (Math.sqrt(3)/4) * Math.pow(side, 2);
}

double circumference() {
    return 3*side;
}
}
