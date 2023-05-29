package Project2;
/*
Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.
 */

public class Task6 {

    public static void main(String[] args) {
        Circle circle = new Circle(10.5);
        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Perimiter of circle: " + circle.calculatePerimiter());
        Square square = new Square(5.5);
        System.out.println("Area of square: " + square.calculateArea());
        System.out.println("Perimiter of square: " + square.calculatePerimiter());
    }
}
interface Shape {
    double calculateArea();

    double calculatePerimiter();
}

class Circle implements Shape {
    double r;
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double calculateArea() {
        return 3.14 * r * r;
    }
    @Override
    public double calculatePerimiter() {
        return 3.14 * 2 * r;
    }
}
class Square implements Shape {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimiter() {
        return side * 4;
    }
}