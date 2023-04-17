package Class11;

public class E5D2Array {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        int sum = 0;
        for (int row = 0; row < arr.length; ++row) {
            for (int col = 0; col < arr[row].length; ++col) {
                int element = arr[row][col];
                if (element % 2 == 0) {
                    sum++;
                }
            }
        }
        System.out.println(sum);


        int counter =0;
        for (int []arr1D:arr){
            for (int num:arr1D){
                if (num%2==0){
                    counter++;
                }
            }
        }
        System.out.println(counter);

    }
}
