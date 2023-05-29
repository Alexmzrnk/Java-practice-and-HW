package class6;

import java.util.Scanner;

public class E4LogicalOperators2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your heights in inches");
        int heights = scanner.nextInt();
        if (heights < 60) {
            System.out.println("You are short");
        } else if (heights >= 60 && heights <= 72){
            System.out.println("You are medium");
        } else {
            System.out.println("Yor are tall");
        }
    }
}
