package HW15;

public class Students {

    /*Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students */

    String name;
    String ID;
    static int numberOfStudents;


    public static void main(String[] args) {

        Students obj1=new Students();
        Students obj2=new Students();
        Students obj3=new Students();

        obj1.name="JC";
        obj1.ID="2023-123T";
        obj1.numberOfStudents++;

        obj2.name="JZ";
        obj2.ID="2023-124T";
        obj2.numberOfStudents++;

        obj3.name="JB";
        obj3.ID="2023-125T";
        obj3.numberOfStudents++;

        System.out.println(numberOfStudents);
        System.out.println();







    }

}
