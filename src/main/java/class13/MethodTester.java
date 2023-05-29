package class13;

import class13.Printer;

public class MethodTester {

    public static void main(String[] args) {
        Printer printer=new Printer();
        printer.printSomething();

        printer.printWord("Darko");
        printer.printWord("Artem");

        printer.printWordManyTimes("Axel",15);




    }
}
