package HW4;

import java.util.Scanner;

public class CurrentTimeCheck {
    public static void main(String[] args) {

        Scanner key=new Scanner(System.in);
        System.out.println("Enter the time, but only hours without minutes in military time format");
        int hour= key.nextInt();
        if (hour<=11){
            System.out.println("This is morning time");
        }else if(12<=hour&&hour<=15){
            System.out.println("This is afternoon time");
        } else if (16<=hour&&hour<=20) {
            System.out.println("This is evening time");
        } else if (21<=hour&&hour<=24) {
            System.out.println("This is night time");
        } else {
            System.out.println("Invalid number");
        }
    }
}
