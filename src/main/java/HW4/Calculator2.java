package HW4;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter the number");
        double num1 = key.nextDouble();
        System.out.println("Enter operator");
        char o = key.next().charAt(0);
        System.out.println("Enter the second number");
        double num2 = key.nextDouble();

        switch (o) {
            case ('+'):
                System.out.println("The result is " + (num1 + num2));
                break;
            case ('-'):
                System.out.println("The result is " + (num1 - num2));
                break;
            case ('*'):
                System.out.println("The result is " + (num1 * num2));
                break;
            case ('/'):
                System.out.println("The result is " + (num1 / num2));

        }

    }
}
