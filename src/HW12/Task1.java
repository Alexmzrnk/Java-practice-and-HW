package HW12;

public class Task1 {
    public static void main(String[] args) {

        /*
        Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
For Example String str=hello =>l
         */

        String word="endless";
        int w=word.length();
       /* int middle=w/2;

        if (word.isBlank()) {
            System.out.println("You need to enter the word");
        } else if (w%2==0) {
            System.out.println("The word should contain odd numbers of characters");
        } else {
            System.out.println(word.charAt(middle));
        }*/


        if (!word.isBlank()&&word.length()%2!=0&&word.length()>=3){
            int middleIndex=word.length()/2;
            char middleChar=word.charAt(middleIndex);
            System.out.println(middleChar);


            System.out.println();
        }



    }
}
