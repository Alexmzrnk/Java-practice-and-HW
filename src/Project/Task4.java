package Project;

public class Task4 {
    public static void main(String[] args) {

       /* Create a 2D array of integers. Develop a program which will
        calculate the sum of even and odd numbers for that array.*/

        int[][] numbers = {
                {41, 9, 44, 9, 36},
                {8, 75, 94, 66, 33},
                {101, 54, 2, 77, 81}};

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int elememt = numbers[i][j];
                if (elememt % 2 == 0) {
                    sumEven = sumEven + elememt;
                } else if (elememt % 2 != 0) {
                    sumOdd = sumOdd + elememt;
                }
            }
        }
        System.out.println("Sum of even numbers =" + sumEven);
        System.out.println("Sum of odd numbers =" + sumOdd);
    }
}
