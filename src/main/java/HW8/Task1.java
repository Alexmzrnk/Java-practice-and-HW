package HW8;

public class Task1 {
    public static void main(String[] args) {

        /*Create a 2D array(shorter way) in which first array will
        consist of 4 names and second array will contain grades.
        Then your program should print name of the students that has A and B grade*/

        String[][] NamesGrades = {{"JB", "JC", "JD", "JZ"},
                                   {"A", "B", "C", "D"}};
        System.out.print(NamesGrades[0][0]+" ");
        System.out.println(NamesGrades[1][0]);
        System.out.print(NamesGrades[0][1]+" ");
        System.out.println(NamesGrades[1][1]);



    }
}
