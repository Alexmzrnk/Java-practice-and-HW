package Project2;

import java.util.Arrays;

/*
Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'
 */
public class Task5 {

    void nonRepeatingChar(String str){
        char [] a=str.toCharArray();
        for(char i:a){
            if (str.indexOf(i) == str.lastIndexOf(i)) {
                System.out.println("First non-repeating character is: "+i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Task5 obj=new Task5();
        obj.nonRepeatingChar("abracadabra");

    }

}
