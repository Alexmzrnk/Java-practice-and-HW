package Project;

public class Task9 {
    public static void main(String[] args) {
        /*Write a java program to find the second largest
number in the array?*/

        int[][] numbers = {
                {41, 9, 12, 9, 36},
                {8, 110, 94, 66, 33},
                {101, 54, 2, 77, 81}};

        int largestNum = numbers[0][0];
        int secondLargestNum = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > largestNum) {
                    secondLargestNum=largestNum;
                    largestNum = numbers[i][j];
                }
                else if (numbers[i][j]>secondLargestNum){
                    secondLargestNum=numbers[i][j];
                }
            }
        }
        System.out.println(largestNum);
        System.out.println(secondLargestNum);
    }
}
