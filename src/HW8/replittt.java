package HW8;

public class replittt {
    public static void main(String[] args) {


        //Write a program that sums all numbers that are on even index and on even row.

        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum = 0;

        for (int j = 0; j < a.length; j += 2) {
            for (int i = 0; i < a[j].length; i += 2) {
                int element = a[j][i];
                sum = sum + a[j][i];
            }


        }
        System.out.println(sum);

    }
}
