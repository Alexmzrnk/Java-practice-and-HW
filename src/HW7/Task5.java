package HW7;

public class Task5 {
    public static void main(String[] args) {

        String [] animals={"Monkey","Deer","Wolf","Fox","Bear"};

        for (int i=0; i<5;i++){
            System.out.println(animals[i]);
        }
        System.out.println();

        for (String names:animals) {
            System.out.print(names + " ");
        }

    }
}
