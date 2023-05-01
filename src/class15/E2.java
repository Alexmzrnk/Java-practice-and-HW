package class15;

public class E2 {
//creat a method call it method1 print hello word inthe method

   /*void method1 (String word){
        System.out.println(word);
    }*/


    void method1() {
        System.out.println("Hello world");
    }

    //create a method that takes an array as input. It adds all the numbers
    //from the array and returns the sum. name of the the method shoild be sumArr

    int sumArr (int [] arr){

        int sum=0;
        for (int i=0; i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;

    }
    void printNumber(){
        //sum is a local variable we can't access it in this method
        // System.out.println(sum);
    }

    public static void main(String[] args) {
        E2 obj=new E2();
        //int sum=obj.sumArr(new int [] {23,5,7,3});
        int[]arr={10,10,10};
        int sum= obj.sumArr(arr);
        System.out.println(sum);

    }


}
