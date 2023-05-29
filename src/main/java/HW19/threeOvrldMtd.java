package HW19;

public class threeOvrldMtd {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    static void displeyPersonData(String name, int age){
        System.out.println("Here is all the information on requested person:  "+"name:"+name+", age:"+age);
    }
    static void displeyPersonData(String name, int age, char MorF){
        System.out.println("Here is all the information on requested person:  "+"name:"+name+", age:"+age+", gender:"+MorF);
    }
    static void displeyPersonData(String name, int age, char MorF, String city){
        System.out.println("Here is all the information on requested person:  "+"name:"+name+", age:"+age+", gender:"+MorF+", live in "+city);
    }
    static void displeyPersonData(String name, int age, char MorF, String city, boolean married){
        System.out.println("Here is all the information on requested person:  "+"name:"+name+", age:"+age+", gender:"+MorF+", live in "+city+", married:"+married);
    }

    public static void main(String[] args) {
        displeyPersonData("Tony Stark",37,'M',"Malibu CA", false);
        displeyPersonData("Pepper Pots", 25, 'F');
        displeyPersonData("Steven Rogers",39);


    }

}
