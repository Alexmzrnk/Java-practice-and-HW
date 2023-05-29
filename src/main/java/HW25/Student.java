package HW25;

import java.util.HashSet;
import java.util.Set;

/*
Create a Set that will hold Objects of Student Type.
In this set we do not care about the insertion order.
Each student object should have name and studentID.
Display name of each student.
 */
public class Student {

    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String display(){
        return name;
    }

    public static void main(String[] args) {

        HashSet<Student> students=new HashSet<>();
        students.add(new Student("JC","0000001"));
        students.add(new Student("JB","0000002"));
        students.add(new Student("JZ","0000003"));

        System.out.println(students);

        for (Student s:students){
            System.out.println(s.display());
        }






    }


}
