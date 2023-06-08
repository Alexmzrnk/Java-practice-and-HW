package HW28;
/*
Create a method checkUserName that will throw a runtime exception.
Method should throw an exception when entered username is less than 5 characters.
 */

import java.util.Scanner;

public class Task2 {
    public static void checkUserNameException(String name) {

        try {
            if (name.length() < 5)
                throw new Exception("Invalid username. Can't be less than 5 characters");
            else
                System.out.println("Valid username");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String userName = scan.next();
        checkUserNameException(userName);

    }

}
