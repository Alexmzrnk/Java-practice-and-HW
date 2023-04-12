package class4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name=scanner.next();
        if (name.equals("Elana")){
            System.out.println("Mac user");

        }else{
            System.out.println("Windows user");
        }

    }
}
