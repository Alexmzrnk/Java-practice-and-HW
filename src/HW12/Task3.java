package HW12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


        Scanner key=new Scanner(System.in);
        System.out.println("Mom's first name?");
        String momName= key.next();
        System.out.println("Dad's first name?");
        String dadName= key.next();
        System.out.println("Boy or Girl?");
        String gender=key.next();
        int middleNameDad=dadName.length()/2;
        int middleNameMam=momName.length()/2;


        if (gender.equals("Boy")){
            System.out.println((dadName.substring(0,middleNameDad).toUpperCase())+(momName.substring(middleNameMam,momName.length()).toUpperCase()));

        } else {
            System.out.println((momName.substring(0,middleNameMam).toUpperCase())+(dadName.substring(middleNameDad,dadName.length()).toUpperCase()));
        }



    }
}
