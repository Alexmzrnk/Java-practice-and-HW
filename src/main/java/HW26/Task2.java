package HW26;

import java.util.HashMap;
import java.util.Map;

/*
Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000
 */
public class Task2 {
    public static void main(String[] args) {

        Map<String, Integer> emplInfo = new HashMap<>();
        emplInfo.put("JC", 77000);
        emplInfo.put("JB", 63000);
        emplInfo.put("JD", 111000);
        emplInfo.put("JZ",99000);


        int highSalary=0;
        String emplHS="";

        for (var e:emplInfo.entrySet()){
            if(e.getValue()>highSalary){
                highSalary=e.getValue();
                emplHS=e.getKey();
            }
        }
        System.out.println(emplHS+"=$"+highSalary);

    }
}
