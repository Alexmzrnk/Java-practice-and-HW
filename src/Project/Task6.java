package Project;

public class Task6 {
    public static void main(String[] args) {

        /* Write a java program to check whether a given number is prime or not?*/

        int n = 4;
        boolean check = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(n + " is prime number");
        } else {
            System.out.println(n + " is not prime number");
        }
    }
}
