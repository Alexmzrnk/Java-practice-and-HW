package class5;

import java.util.Scanner;

public class E4NestedIf {
    public static void main(String[] args) {

        /*
        creat the variable money store the value 20000 inside that variable
        write if-else if money is greate that 10000 programm should check another condition
        fot expm it should check what day is today, if the day is Sunday it should say lets go shopping
         */

        int money = 2000;
        String day = "Monday";

        if (money < 10000) {
            if (day == "Sunday") {
                System.out.println("Let's go shopping");
            } else if (money < 10000) {
                System.out.println("Let's save money");
            } else {
                System.out.println("Let's wait for Sunday");
            }
        }
    }
}
