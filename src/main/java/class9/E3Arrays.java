package class9;

public class E3Arrays {
    public static void main(String[] args) {

       /* double [] numbers={10.5,5.5,0.05,100.5,586};
        int i=0;
        System.out.println(numbers[i]);//command +d add the same line

        for (int j=0; j<=4;j++){
            i=j;
            System.out.println(numbers[i]);
        }*/

        double [] numbers={10.5,5.5,0.05,100.5,586};
        System.out.println(numbers.length);

        for (int j=0;j<numbers.length;j++){ // to avoid count of indexes, just add numbers.length
            System.out.print(numbers[j]+" ");
        }
    }
}
