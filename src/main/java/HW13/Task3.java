package HW13;

public class Task3 {
    public static void main(String[] args) {

        //How would you swap  2 strings without a temporary variable?

        String word1="Dog";
        String word2="Cat";

        word1=word1.concat(word2);

        word2=word1.substring(0,3);
        word1=word1.substring(3,6);

        System.out.println("Word1="+word1);
        System.out.println("Word2="+word2);





    }
}
