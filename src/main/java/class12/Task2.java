package class12;

public class Task2 {
    public static void main(String[] args) {

        String name="Today is Saturday";

       // System.out.println(name.indexOf('a',4)+name.indexOf('a',10)+name.indexOf('a',15));

      for (int i=0; i<name.length(); i++){
          if (name.charAt(i)=='a'){
              System.out.print(i+" ");
          }
        }

    }
}
