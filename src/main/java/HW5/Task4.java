package HW5;

public class Task4 {
    public static void main(String[] args) {

        // Print odd numbers between 20 and 50 (2 ways)

        //1st way

        int num = 21;
        while (num < 50) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
            num++;
        }
        System.out.println();

        //2nd way

        for (int i = 21; i < 50; i += 2) {
            System.out.print(i + " ");
        }

    }
}
