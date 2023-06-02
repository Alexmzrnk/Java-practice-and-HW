package HW26;

import java.util.HashMap;
import java.util.Map;

/*
Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.

In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.
 */
public class Person {
    private String name, lastName;
    private int age, salary;

    public Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Person info: " + name + " " + lastName + ", age: " + age + ", salary: " + salary);
    }
}

class TestClass {
    public static void main(String[] args) {

        Map<String, Person> personInfo = new HashMap<>();
        personInfo.put("0000001PI", new Person("JC", "Brown", 34, 57000));
        personInfo.put("0000002PI", new Person("JB", "Black", 28, 43000));
        personInfo.put("0000003PI", new Person("JZ", "White", 43, 97000));

        for (var p : personInfo.entrySet()) {
            System.out.println("Person ID: " + p.getKey());
            p.getValue().printInfo();

        }

    }

}