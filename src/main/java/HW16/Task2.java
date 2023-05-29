package HW16;

public class Task2 {
    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name
     */

    private String vowels(String sentence) {

        String str = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {

                char l = sentence.charAt(i);
                str = str + l;
            }
        }
        return str;

    }
    public static void main(String[] args) {
        Task2 obj = new Task2();
        String str = obj.vowels("World hold on");
        System.out.println(str);
    }

}
