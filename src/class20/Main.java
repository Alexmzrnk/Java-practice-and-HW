package class20;

import class18.D;
public class Main {
    String name;
    String color;
    String breed;
    int age;
    double weight;


    void eat(){
        System.out.println("eating.....");
    }
    void sleep(){
        System.out.println("ZZZzzzzZZZzzz.....");
    }
    void run(){
        System.out.println("running....");
    }

    public Main(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

}

class Dog extends Main{
    Dog(String name, String color, String breed, int age, int weight){
        super(name,color,breed,age,weight);
    }

    @Override
    void sleep() {
        System.out.println("I like to sleep for 10 hours a day");
    }
}


class Cat extends Main{
    Cat(String name, String color, String breed, int age, int weight){
        super(name,color,breed,age,weight);
    }
}

class Horse extends Main{
    Horse(String name, String color, String breed, int age, int weight){
        super(name,color,breed,age,weight);
    }
}
