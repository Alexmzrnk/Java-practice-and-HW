package class4;

import java.util.Scanner;

public class E10Scanner {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your gender");
        /*
        there is no direct method for thew char datatype in scanner class
        we first use a work around we first use the next method to take a String from
        the user and from that String we exctract the first letter by passing 0 to the chartAt() method
         */
        char gender=scanner.next().charAt(0);
        System.out.println("you entered "+gender);
    }
}
