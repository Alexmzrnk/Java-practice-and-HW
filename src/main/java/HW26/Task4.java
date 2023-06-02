package HW26;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */
public class Task4 {
    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>();
        elements.add(70);
        elements.add(30);
        elements.add(70);
        elements.add(50);
        elements.add(80);

        Integer sum = 0;

        for (Integer e : elements) {

            sum = sum + e;
        }
        System.out.println(sum);

    }
}
