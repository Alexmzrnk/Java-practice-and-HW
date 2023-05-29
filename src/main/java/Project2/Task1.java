package Project2;

public class Task1 {
    /*
    Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH"
     */
    public static void main(String[] args) {
        System.out.println("*******method 1********");
        String str = "Hello";
        String rvrs = "";

        for (int i = 0; i < str.length(); i++) {
            rvrs = str.charAt(i) + rvrs;
        }
        System.out.println(rvrs);

        System.out.println("*******method 2********");
        StringBuilder str2 = new StringBuilder(str);
        str2.reverse();
        System.out.println(str2);

    }
}
