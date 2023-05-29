package HW5;

public class Task3 {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)

        //1st way
        int num = 20;
        while (num > 1) {
            if (num % 2 != 1) {
                System.out.print(num + " ");
            }
            num--;
        }
        //2nd way
        System.out.println();

        for (int i = 20; i > 1; i -= 2) {
            System.out.print(i + " ");
        }
    }
}
