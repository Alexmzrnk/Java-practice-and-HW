package Class11;

public class E7D2Array {
    public static void main(String[] args) {

        boolean[][] arr2D = {
                {true, false, true, true, false},
                {true, false, false, false, false}
        };

        int i = 0;
        for (boolean[] arr1D : arr2D) {
            for (boolean num : arr1D) {
                if (num==true) { // possible just to (num) it is also true
                    i++;
                }
            }
        }
        System.out.println(i);
    }
}
