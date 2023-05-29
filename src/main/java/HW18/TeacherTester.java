package HW18;

public class TeacherTester {
    public static void main(String[] args) {


    MathTeacher mathTeacher=new MathTeacher();
    mathTeacher.name="Luke Skywalker";
    mathTeacher.genderMorF='M';
    mathTeacher.age=34;
    mathTeacher.ratePerhour=22;
    mathTeacher.testing();
    mathTeacher.punctuality();

    ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
    chemistryTeacher.name="Obi-Wan Kenobi";
    chemistryTeacher.genderMorF='M';
    chemistryTeacher.age=62;
    chemistryTeacher.ratePerhour=25;
    chemistryTeacher.married();
    chemistryTeacher.lab();

    PianoTeacher pianoTeacher=new PianoTeacher();
    pianoTeacher.name="Leia Organo";
    pianoTeacher.genderMorF='F';
    pianoTeacher.ratePerhour=21;
    pianoTeacher.testing();
    pianoTeacher.typeofmusic();

    Teacher teacher=new Teacher();
    teacher.name="Darth Vader";
    teacher.genderMorF='M';
    teacher.age=58;
    teacher.ratePerhour=74;
    teacher.secondEducation();
    teacher.married();

    }
}
