package Project2;

public abstract class Marks {

    int mark1, mark2, mark3;

    public Marks(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public abstract double getPercentage();

}
