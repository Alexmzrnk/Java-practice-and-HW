package HW4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = key.nextInt();
        System.out.println("Enter operator");
        char operator = key.next().charAt(0);
        System.out.println("Enter the second number");
        int number2 = key.nextInt();

        if (operator == '+') {
            System.out.println("Result is " + (number1 + number2));
        } else if (operator == '-') {
            System.out.println("Result is " + (number1 - number2));
        } else if (operator == '*') {
            System.out.println("Result is " + (number1 * number2));
        } else if (operator == '/') {
            System.out.println("Result is " + (number1 / number2));
        }

    }
}
