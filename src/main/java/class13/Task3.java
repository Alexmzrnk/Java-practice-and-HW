package class13;

public class Task3 {
    public static void main(String[] args) {

        String str="ksnfksnDSKJDJ123454365#%$&^(@)";

        String str1=str.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(str1.length());

    }
}
