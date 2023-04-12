package class9;

public class E12Arrays {
    public static void main(String[] args) {


        int [] numbers=new int [5];
        int sum=50;

        for (int i=0; i<numbers.length; i++){
            numbers[i]=sum;
            sum=sum+10;
        }

        for (int number : numbers) {
            System.out.println(number);
        }


    }
}
