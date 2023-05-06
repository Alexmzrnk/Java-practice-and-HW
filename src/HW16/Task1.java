package HW16;

public class Task1 {
    /*Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.*/

    public String reversed(String sentence) {
        StringBuilder rev = new StringBuilder(sentence);
        rev.reverse();
        sentence = rev.toString();
        return sentence;
    }

    public static void main(String[] args) {
        Task1 obj = new Task1();
        String sentence = obj.reversed("World hold on");
        System.out.println(sentence);

    }


}
