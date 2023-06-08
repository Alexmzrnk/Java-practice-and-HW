package HW28;

import java.util.Scanner;

/*
Create a method to check age eligibility that will throw a runtime exception.
Method should throw an exception age is less than 16.
 */
public class Task1 {

    public static void ageEligibilityException(int age) {
        try {
            if (age < 16)
                throw new RuntimeException("Invalid age");
            else
                System.out.println("Valid age");
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        ageEligibilityException(age);
    }
}
