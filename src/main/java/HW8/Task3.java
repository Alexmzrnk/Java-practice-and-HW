package HW8;

public class Task3 {
    public static void main(String[] args) {

        /*Using 2D array create a grocery list.
        Inside you should have an array of veggies, fruits, dairy and sweets.
        Retrieve all values from that array using 2 different loops
         */

        String [][] groceryList={
                {"Potato", "Carrot", "Tomato", "Onion"},
                {"Peach","Apple","Pear", "Orange"},
                {"Chocolate", "Biscuits", "Sweets"},
                {"Milk", "Juice", "Water","Coke"}
        };
        for (int row=0; row<groceryList.length;row++) {
            for (int column = 0; column < groceryList[row].length; column++) {
                System.out.print(groceryList[row][column] + ", ");
            }
            System.out.println();

        }
        System.out.println();

        for (String [] list:groceryList) {
            for (String row : list) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
