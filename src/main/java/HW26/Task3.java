package HW26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
 */
public class Task3 {
    public static void main(String[] args) {

        ArrayList<String> elements = new ArrayList<>();
        elements.add("ABC");
        elements.add("DEF");
        elements.add("GHI");
        elements.add("JKL");
        elements.add("MNO");

        String concatedElmt = "";

        for (String e : elements) {
            concatedElmt = concatedElmt + e;
        }

        System.out.println(concatedElmt);

    }
}
