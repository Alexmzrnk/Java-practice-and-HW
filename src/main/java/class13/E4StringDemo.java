package class13;

public class E4StringDemo {
    public static void main(String[] args) {

        String str="Today is Sunday. we have java class. we like java";

        String [] strArr=str.split("[.!?]");
        String [] strArr1=str.split("[ ]");
        System.out.println(strArr.length);
        System.out.println(strArr1.length);
        System.out.println(strArr[2].trim());


    }
}
