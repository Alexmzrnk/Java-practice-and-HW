package HW21;

public class ComputerTester {
    public static void main(String[] args) {

        Computer[] cmptr = {new Apple("MacBook air m1", "silver", 1.29),
                new Lenovo("Yoga", "Black", 1.71),
                new HP("Aero", "White", 1.49),
                new Dell("Inspiron", "Blue", 1.52)};

        for (Computer c : cmptr) {
            c.printInfo();
            if (c instanceof Apple) {
                ((Apple) c).ios();
            } else if (c instanceof HP) {
                ((HP) c).windows();
            }
            c.turnOn();
            c.sound();
            c.wifi();
        }
    }
}
