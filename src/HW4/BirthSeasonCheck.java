package HW4;

import java.util.Scanner;

public class BirthSeasonCheck {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter the  month of your birth in numbers");

        int month = key.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("You were born in season Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("You were born in season Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("You were born in season Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("You were born in season Autumn");
                break;
            default:
                System.out.println("Wrong month number");
        }
    }
}
