package class8;

public class E11NestedLoop {
    public static void main(String[] args) {

        /*
        2 4 6 8 10
        2 4 6 8 10
        2 4 6 8 10
        2 4 6 8 10

         */

        for (int i = 1; i < 5; i++) {
            for (int j = 2; j <= 10; j += 2) {
                if (j % 2 == 0) ;
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        int counter=0;
        while (counter<4) {
            for (int a=2; a<=10; a=a+2) {
                System.out.print(a + " ");
            }
            System.out.println();
            counter++;
        }



    }
}
