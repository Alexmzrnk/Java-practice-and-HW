package class13;

public class Task2 {
    public static void main(String[] args) {

        String str="Today is Sunday. we have java class. we like java";

        String [] strArr=str.split("[.!?]");
        str = str.replaceAll(" ", "");
        //System.out.println(str.replace(" ", ""));

        System.out.println(str);


    }
}
