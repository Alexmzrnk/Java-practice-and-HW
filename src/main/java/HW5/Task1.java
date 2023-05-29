package HW5;

public class Task1 {
    public static void main(String[] args) {

        //Print numbers from 1 to 100 in 1 line with space
        int num = 1;
        while (num <= 100) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        int n = 1;
        do {
            System.out.print(n + " ");
            n++;
        } while (n <= 100);
    }
}
