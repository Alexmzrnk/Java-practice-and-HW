package HW3;

import java.util.Scanner;

public class DMVCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");

        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("You eligible to get driver license.");
        } else {
            System.out.println("You are need to get a learners permit at first.");
        }
    }
}
