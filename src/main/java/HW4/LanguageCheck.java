package HW4;

import java.util.Scanner;

public class LanguageCheck {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter you country");
        String country = key.next();
        switch (country) {
            case ("Germany"):
                System.out.println("You speak German");
                break;
            case ("France"):
                System.out.println("You speak French");
                break;
            case ("Great Britain"):
                System.out.println("You speak English");
                break;
            case ("Italy"):
                System.out.println("You speak Italian");
                break;
            case ("Spaine"):
                System.out.println("You speak Spanish");
                break;
        }
        Scanner key1 = new Scanner(System.in);
        System.out.println("Enter your grade:A,B,C or D.");
        char grade = key1.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("You entered grade A, it means Excellent");
                break;
            case 'B':
                System.out.println("You entered grade B, it means Good");
                break;
            case 'C':
                System.out.println("You entered grade C, it means Average");
                break;
            case 'D':
                System.out.println("You entered grade D, it means Bad");
                break;
            default:
                System.out.println("Other grade NOT acceptable");
        }
    }
}
