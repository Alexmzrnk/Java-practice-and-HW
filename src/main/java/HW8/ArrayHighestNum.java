package HW8;

import java.util.Scanner;

public class ArrayHighestNum {
    public static void main(String[] args) {

        int[] numbers = new int[4];

        Scanner key = new Scanner(System.in);
        int highestNum = numbers[0];


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter int numbers");
            numbers[i] = key.nextInt();
            { if (numbers[i] > highestNum) {
                highestNum = numbers[i];
            }
            }
        }
        System.out.println(highestNum);



    }
}
