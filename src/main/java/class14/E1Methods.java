package class14;

public class E1Methods {
    void printWord(String word){
        System.out.println(word);
    }

    /*
    void= return type of the method void means this method doesnt not return any data other example of return types can
    be string int boolean char Dog Cat etc
    printWord = it's the name of the method
    (String word) => parameters/input

   {System.out.println(word);}=body of the method you can write if else contitions loop
     */
    /*
    create a method that takes
     */

    public static void main(String[] args) {
        // we are creating object of the E1Methods class
        // in Java all classes can be treated as data type

        E1Methods obj=new E1Methods();
        obj.printWord("Java");
    }
}
