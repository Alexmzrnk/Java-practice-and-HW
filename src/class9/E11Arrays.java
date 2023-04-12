package class9;

public class E11Arrays {

    public static void main(String[] args) {

        /*there are two ways of creating arrays
        new int [5]=> create an array of int with size 5
         */
        int [] numbers=new int [5];
        numbers[0]=50;// store 50 on index 2
        numbers[1]=60;// store 100 on index 0
        numbers[2]=70;
        numbers[3]=80;
        numbers[4]=90;
        for (int number: numbers) {
            System.out.println(number);
        }

    }
}
