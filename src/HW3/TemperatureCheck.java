package HW3;

import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the city name.");

        String city = scan.next();
        System.out.println("Please enter temperature in your city.");
        int temp = scan.nextInt();
        double tempC=((temp-32)/1.8);
        int tempC1= (int) tempC;

        System.out.println("The temperature in the city "+city+" is "+tempC1+"C.");

    }
}
