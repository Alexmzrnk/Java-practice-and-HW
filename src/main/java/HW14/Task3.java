package HW14;

public class Task3 {

    //Write a method to return whether given number is prime or not?

    boolean primeNumber(int n) {
        boolean check = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                check = false;
                break;
            } else {
                check = true;
            }
        }
        return check;
    }

    public static void main(String[] args) {
       Task3 obj=new Task3();
        System.out.println(obj.primeNumber(4));
    }


}
