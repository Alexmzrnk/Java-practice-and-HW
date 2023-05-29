package HW5;

public class Task2 {
    public static void main(String[] args) {
        //Print numbers from 100 to 1

        int num=100;
        while(num>=1) {
            System.out.print(num + " ");
            num--;
        }
        System.out.println();

        for(int i=100; i>=1; i--){
            System.out.print(i+" ");
        }
        System.out.println();

        int n=100;
        do{
            System.out.print(n+" ");
            n--;
        } while(n>=1);


    }

}
