package HW4;

public class WeekendWeekdayCheck {

    public static void main(String[] args) {

        int day = 6;

        if (day <= 5) {
            System.out.println("It is weekday");
        } else if (6<=day&&day<=7) {
            System.out.println("It is weekend");
        } else {
            System.out.println("Invalid day");
        }
    }
}
