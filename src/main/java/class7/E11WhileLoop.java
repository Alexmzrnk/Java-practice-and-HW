package class7;

public class E11WhileLoop {
    public static void main(String[] args) {

        int num = 100;
        while (num>0) { //same as num>=1
            System.out.print(num + " ");
            num--;
        }

        num=20; //only even numbers from 20 to 100
        System.out.println(); // sout for start new line
        while(num<=100){
            System.out.print(num+" ");
            num+=2;
        }

        num=100; //only odd numbers from 100 to 1
        System.out.println();
        while (num>=1){
            if(num%2==1){ //the same as num%2!=0
                System.out.print(num+" ");
            }
            num--;
        }
    }
}

