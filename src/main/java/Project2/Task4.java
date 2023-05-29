package Project2;

import java.util.Arrays;

/*
   Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.
    */
public class Task4 {
    void isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println("not anagrams");
        } else {
            char[] a1 = str1.toCharArray();
            char[] a2 = str2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            if (Arrays.equals(a1, a2)) {
                System.out.println(str1 + " and " + str2 + " are anagrams");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams");
            }
        }
    }

    public static void main(String[] args) {
        Task4 obj = new Task4();
        obj.isAnagram("listen", "silent");

    }
}
