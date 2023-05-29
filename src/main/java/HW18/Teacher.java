package HW18;

public class Teacher {

    /*Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes
     */

    String name;
    int age;
    char genderMorF;
    double ratePerhour;

    void married() {
        System.out.println("Has family");
    }
    void punctuality() {
        System.out.println("This teacher never late");
    }
    void secondEducation() {
        System.out.println("Getting second educations");
    }
    void testing() {
        System.out.println("Tests students");
    }
}
class MathTeacher extends Teacher {

}
class ChemistryTeacher extends Teacher {

    void lab() {
        System.out.println("Conduct laboratory experiments");
    }
}
class PianoTeacher extends Teacher {

    void typeofmusic() {
        System.out.println("Play classic music");
    }
}



