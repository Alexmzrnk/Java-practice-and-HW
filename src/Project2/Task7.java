package Project2;

/*
We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code
 */
public class Task7 {
    public static void main(String[] args) {
        A a = new A(58, 33, 62);
        B b = new B(35, 44, 59, 25);
        System.out.println("The average of marks is:" + a.getPercentage());
        System.out.println("The average of marks is:" + b.getPercentage());
    }
}
abstract class MarksOfStdnt {
    int mark1, mark2, mark3;

    public MarksOfStdnt(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    public abstract double getPercentage();
}

class A extends MarksOfStdnt {
    public A(int mark1, int mark2, int mark3) {
        super(mark1, mark2, mark3);
    }

    @Override
    public double getPercentage() {
        return (mark1 + mark2 + mark3) / 3;
    }
}
class B extends MarksOfStdnt {

    int mark4;

    public B(int mark1, int mark2, int mark3, int mark4) {
        super(mark1, mark2, mark3);
        this.mark4 = mark4;
    }
    @Override
    public double getPercentage() {
        return (mark1 + mark2 + mark3 + mark4) / 4;
    }
}



