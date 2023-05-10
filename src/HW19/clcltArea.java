package HW19;

/*
Create 1 class in which create a methods that will calculate the area of Method name must be called calculateArea
Rectangle
Square

Use separate class to test your code
 */
public class clcltArea {

    static void calculateArea(int heigth, int width) {
        System.out.println("The area of rectangle is:" + (heigth * width));
    }

    static void calculateArea(int side) {
        System.out.println("The area of square is:" + (side * side));
    }

    public static void main(String[] args) {
        calculateArea(3);
    }
}

class clcltAreaTester {
    public static void main(String[] args) {
        clcltArea.calculateArea(3, 4);
    }
}

