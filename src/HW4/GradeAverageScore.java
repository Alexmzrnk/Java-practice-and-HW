package HW4;

import java.util.Scanner;

public class GradeAverageScore {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter the quiz score");
        int quizscore = key.nextInt();
        System.out.println("Enter the mid term score");
        int midTermscore = key.nextInt();
        System.out.println("Enter the final score");
        int finalScore = key.nextInt();

        int averageScore = (quizscore + midTermscore + finalScore) / 3;
        System.out.println("The average score is " + averageScore);
        if (averageScore >= 90) {
            System.out.println("This is Grade A");
        } else if (70 <= averageScore && averageScore < 90) {
            System.out.println("This is Grade B");
        } else if (50 <= averageScore && averageScore < 70) {
            System.out.println("This is Grade C");
        } else if (averageScore < 50) {
            System.out.println("This is Grade F");
        }
    }
}
