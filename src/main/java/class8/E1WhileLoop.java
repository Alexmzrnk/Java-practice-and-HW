package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {

        //to print all the numbers from a starting point to an ending point
        // ask the user for starting and ending number

        Scanner key = new Scanner(System.in);
        System.out.println("Enter the starting and ending number and the step");
        int start = key.nextInt();
        int end = key.nextInt();
        int step = key.nextInt();
        int num = start;
        while (num <= end) {
            System.out.print(num + " ");
            num = num + step;//number+=step;
        }
    }
}
