package Project;

public class Task2 {
    public static void main(String[] args) {

        /*Create an array of integer values. After the array is created,
         calculate the sum of all stored elements in that array.*/

        int [] numbers = {34,97,2,58,116,136,22};

        int sum=0;
        for (int i=0; i<numbers.length; i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);



    }
}
