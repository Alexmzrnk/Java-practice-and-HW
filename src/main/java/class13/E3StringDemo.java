package class13;

public class E3StringDemo {
    public static void main(String[] args) {

        String str="ksnfksnDSKJDJ123454365#%$&^(@)";

        System.out.println(str.replaceAll("[^a-z]",""));
        //dont replace lower case letters from a-z and numbers 0-9
        System.out.println(str.replaceAll("[^a-z0-9]",""));
        // cheatshit https://regexr.com/   custom regular expresion

        System.out.println(str.replaceAll("[Dn3]",""));
        System.out.println(str.replaceAll("[A-Z]","\\$"));
        //$ can be only with \\




    }
}
