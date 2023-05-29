package HW14;

import java.util.Scanner;

public class Task1 {
/*
Create a method that will say Hello in different language
 based on the country that will passed when method is executed.
 */

    void sayHello(String lngd) {
        switch (lngd) {
            case ("Germany"):
                System.out.println("Hallo");
                break;
            case ("France"):
                System.out.println("Bonjour");
                break;
            case ("Great Britain"):
                System.out.println("Hello");
                break;
            case ("Italy"):
                System.out.println("Ciao");
                break;
            case ("Spaine"):
                System.out.println("Hola");
                break;
        }

    }

    public static void main(String[] args) {

        Task1 obj = new Task1();
        obj.sayHello("Italy");
    }
}
