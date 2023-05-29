package HW8;

public class reppplit {
    public static void main(String[] args) {

        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };
        int sum = 0;

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
                sum = sum + a[j][i];
            }
            System.out.println(sum);
            sum = 0;

            System.out.println();
        }

    }
}
