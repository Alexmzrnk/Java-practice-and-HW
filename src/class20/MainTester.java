package class20;

public class MainTester {
    public static void main(String[] args) {


        Dog dog = new Dog("Jam", "Brown", "Husky", 5, 15);
        Cat cat = new Cat("Tom", "White", "Persian", 4, 9);
        Horse horse = new Horse("Jam", "Black", "Arabic", 2, 67);
        dog.eat();
        dog.sleep();
        dog.run();

        cat.eat();
        cat.sleep();
        cat.run();

        horse.eat();
        horse.sleep();
        horse.run();
    }
}
