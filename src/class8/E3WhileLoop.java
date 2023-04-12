package class8;

public class E3WhileLoop {

    public static void main(String[] args) {

        //write a loop to add all the even numbers from 1 to 30

        int num = 1;
        int sum = 0;
        while (num <= 30) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                sum = sum + num;
            }
            num++;
        }
        System.out.println();
        System.out.println(sum);

        System.out.println();

        System.out.println();
        int sum1 = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 2 != 1) {
                sum1 = sum1 + i;
            }
        }
        System.out.println(sum1);

    }

}
