package HW21;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */

    String model;
    String color;
    double weight;

    public Computer(String model, String color, double weight) {
        this.model = model;
        this.color = color;
        this.weight = weight;
    }

    void printInfo() {
        System.out.println(model + " " + color + " " + weight);
    }

    void turnOn() {
        System.out.println("Has the button to turn it on");
    }

    void sound() {
        System.out.println("Computer provides sound throw speakers");
    }

    void wifi() {
        System.out.println("Connects to internet via WIFI");
    }
}

class Apple extends Computer {
    public Apple(String model, String color, double weight) {
        super(model, color, weight);
    }

    void turnOn() {
        System.out.println("Apple computers have the button to turn it on");
    }

    void sound() {
        System.out.println("Computer provides sound throw speakers");
    }

    void wifi() {
        System.out.println("Connects to internet via WIFI");
    }

    void ios() {
        System.out.println("Apple computers use IOS operating system");
    }
}

class Lenovo extends Computer {
    public Lenovo(String model, String color, double weight) {
        super(model, color, weight);
    }

    void turnOn() {
        System.out.println("Lenovo computers have the button to turn it on");
    }

    void sound() {
        System.out.println("Computer provides sound throw speakers");
    }

    void wifi() {
        System.out.println("Connects to internet via WIFI");
    }

}

class HP extends Computer {

    public HP(String model, String color, double weight) {
        super(model, color, weight);
    }

    void turnOn() {
        System.out.println("HP computers have the button to turn it on");
    }

    void sound() {
        System.out.println("Computer provides sound throw speakers");
    }

    void wifi() {
        System.out.println("Connects to internet via WIFI");
    }

    void windows() {
        System.out.println("Operating system is Windows");
    }
}

class Dell extends Computer {
    public Dell(String model, String color, double weight) {
        super(model, color, weight);
    }

    void turnOn() {
        System.out.println("Dell computers have the button to turn it on");
    }

    void sound() {
        System.out.println("Computer provides sound throw speakers");
    }

    void wifi() {
        System.out.println("Connects to internet via WIFI");
    }
}
