package class6;

public class E4LogicalOperators {
    public static void main(String[] args) {

        int day=6;
// double, float, boolean not work in switch
        // logical and relational operators not work in switch
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("wrong day number");

        }



    }
}
