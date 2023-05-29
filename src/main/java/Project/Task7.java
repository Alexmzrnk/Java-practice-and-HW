package Project;

public class Task7 {
    public static void main(String[] args) {
        /*
    Write a Java Program to print the first 10 numbers of Fibonacci series.
     */

        int n0=1;
        int n1=1;
        int n2;

        for (int i=3; i<13; i++){
            n2=n0+n1;
            System.out.println(n2);
            n0=n1;
            n1=n2;
        }
        System.out.println();


    }
}
