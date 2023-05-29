package HW4;

import java.util.Scanner;

public class NumbersValue {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = key.nextInt();

        if (number <= 10) {
            System.out.println("This is the small number");
        } else if (11 <= number && number <= 100) {
            System.out.println("This is medium number");
        } else if (101 <= number && number <= 1000) {
            System.out.println("This is large number");
        } else {
            System.out.println("Invalid number");
        }


    }


}
