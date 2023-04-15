package HW7;

public class Task4 {
    public static void main(String[] args) {

        String[] cars = {"Porsche", "Mersedes", "BMW", "Audi", "VW", "Opel"};

        for (int i = 0; i < 6; i++) {
            System.out.println(cars[i]);
        }
        System.out.println();

        for (String names : cars) {
            System.out.print(names + " ");
        }

        System.out.println();
        System.out.println();

        int i = 0;
        while (i < cars.length) {
            System.out.println(cars[i] + " ");
            i++;
        }

    }
}
