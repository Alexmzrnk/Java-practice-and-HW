package class8;

public class E12NestedLoop {
    public static void main(String[] args) {

        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++){
                System.out.print(j+" ");//think about to put i instead j
            }
            System.out.println();
        }
    }
}
