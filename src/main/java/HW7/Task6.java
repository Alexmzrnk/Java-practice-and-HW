package HW7;

public class Task6 {

    public static void main(String[] args) {

        int[] numbers = {58, 4, 91, 55, 42, 111};

        int sum=0;

        for (int i=0; i<6;i++){
            sum=sum+numbers[i];

        }
        System.out.println(sum);

        System.out.println();

        int sum1=0;


        for (int num:numbers){
            sum1=sum1+num;

        }
        System.out.println(sum1);

    }
}
