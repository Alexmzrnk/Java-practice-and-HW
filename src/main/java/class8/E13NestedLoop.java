package class8;

public class E13NestedLoop {

    public static void main(String[] args) {


        for (int j = 0; j < 3; j++) {   // this line shows how many row should be (3 rows)
            for (int i = 1; i <= 5; i++) { // this line shows hoe many numbers and value of it should be in the row
                System.out.print(i + j + " ");
            }
            System.out.println();
        }

    }
}
