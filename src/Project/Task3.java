package Project;

public class Task3 {
    public static void main(String[] args) {

        /*Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.*/

        int[][] numbers = {
                {41, 9, 44, 9, 36},
                {8, 75, 94, 66, 33},
                {101, 54, 2, 77, 81}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int element = numbers[i][j];
                if (element % 2 == 0) {
                    System.out.println(element);
                }
            }
        }

    }
}
