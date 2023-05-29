package HW3;

import java.util.Scanner;

public class LoanAprrove {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the expected amount of your loan.");

        int loanAmount= scan.nextInt();
        if (loanAmount<=200000){
            System.out.println("You are approved for a loan.");
        } else if (loanAmount>200000){ // if (loanAmount>200000) --- can be removed, the system will also work proper.
            System.out.println("Sorry, you are NOT approved for a loan.");
        }
    }
}
