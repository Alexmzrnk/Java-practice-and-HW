package Project2;

public class Task2 {
    /*
    Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome
     */
    public static void main(String[] args) {

        String str = "madam";
        String rts = "";

        for (int i = 0; i < str.length(); i++) {
            rts = str.charAt(i) + rts;
        }
        System.out.println("backward: "+rts);
        if (str.equals(rts)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }

    }
}
