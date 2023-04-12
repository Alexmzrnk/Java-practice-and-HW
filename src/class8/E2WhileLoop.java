package class8;

import java.util.Scanner;
import java.util.SortedMap;

public class E2WhileLoop {
    public static void main(String[] args) {

        //in a while loop ask the user to enters any numbers
        // other then -1 print "Hello world" and keep on asking the user for a number
        // the moment user enters the number -1 the loop should stop

        Scanner key = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = key.nextInt();
        while (num != -1) {
            System.out.println("Hello world");
            System.out.println("Try again");
            num = key.nextInt();
        }
    }
}
