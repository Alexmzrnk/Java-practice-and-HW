package HW19;

import java.util.Arrays;

public class PrvtOvrld {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    private static void printInfo(int a) {
        System.out.println("Got Integer data.");
    }

    private static void printInfo(char c) {
        System.out.println("Got Char data.");
    }

    private static void printInfo(String a) {
        System.out.println("Got String object.");
    }

    public static void main(String[] args) {
        printInfo("Moon");
        printInfo(1);
        printInfo('+');
    }
}
