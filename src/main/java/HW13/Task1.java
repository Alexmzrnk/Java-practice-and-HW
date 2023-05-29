package HW13;

public class Task1 {
    public static void main(String[] args) {
        /*
        How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
         */

        String sentence = "This is sentence i want to reverse";

        String[] words = sentence.split(" ");
        String reverse = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reverse = reverse + reverseWord + " ";
        }
        System.out.print(reverse);
    }
}
