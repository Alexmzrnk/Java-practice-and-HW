package Project;

public class Task1 {
    public static void main(String[] args) {
        /*1. Create a program that uses an array to store a list of temperatures for a week,
        and then uses a loop to find the highest and lowest temperature for the week.*/

        int [] tempDay =new int [7];
        tempDay [0]=24;
        tempDay [1]=26;
        tempDay [2]=19;
        tempDay [3]=17;
        tempDay [4]=22;
        tempDay [5]=25;
        tempDay [6]=26;

        int highestTemp=tempDay[0];
        int lowestTemp=tempDay[0];

        for (int num: tempDay){
            if (num > highestTemp){
            highestTemp=num;
            } else if (num<lowestTemp) {
                lowestTemp=num;
            }
        }
        System.out.println("The highest temperature for week "+highestTemp+"C");
        System.out.println("The lowest temperature for week "+lowestTemp+"C");





    }
}
