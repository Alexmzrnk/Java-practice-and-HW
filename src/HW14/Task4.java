package HW14;

public class Task4 {
/*
Create  class Student that will have a method getGrade.
Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
 */
void getGrade(int Score){


    if (Score >= 90) {
        System.out.println("This is Grade A");
    } else if (70 <= Score && Score < 90) {
        System.out.println("This is Grade B");
    } else if (50 <= Score && Score < 70) {
        System.out.println("This is Grade C");
    } else if (Score < 50) {
        System.out.println("This is Grade F");
    }
}

    public static void main(String[] args) {
        Task4 obj=new Task4();
        obj.getGrade(75);
    }

}
