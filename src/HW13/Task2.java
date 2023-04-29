package HW13;

public class Task2 {
    public static void main(String[] args) {

        /*How would you check if String is palindrome or not? aba=> true
Abbc =>false*/


        String word = "abbc";
        String reversedGiven = "";
        char l;

        for (int i = 0; i < word.length(); i++) {
            l = word.charAt(i);
            reversedGiven = l + reversedGiven;
        }

        word = word.toLowerCase();
        reversedGiven = reversedGiven.toLowerCase();

        if (word.equals(reversedGiven)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
