package Project;

public class Task5 {
    public static void main(String[] args) {

        /*Write a program to swap 2 numbers without a temporary variable?*/

        int x=19;
        int y=81;

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("new value x =" +x);
        System.out.println("new value y =" +y);



    }
}
