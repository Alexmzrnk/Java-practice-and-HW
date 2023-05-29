package HW8;

public class Task2 {
    public static void main(String[] args) {

        /*Create 2D array of cars :
        american, german, korean, italian.
        Then retrieve all values from that array using 2 different loops
         */

      String [][] cars={
              {"Ford", "Buick", "Lincoln", "Chevrolet"},
              {"BMW","Mersedes","Audi", "VW"},
              {"Hyndai", "KIA", "Genesis"},
              {"Maserati", "Ferrari", "Lamborghini","Alfa Romeo"}
      };
        for (int row=0; row<cars.length;row++) {
            for (int column = 0; column < cars[row].length; column++) {
                System.out.print(cars[row][column] + ", ");
            }
            System.out.println();
        }
    }
}
