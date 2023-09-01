package Lessons.Exercise.ExerciseInterfaces;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Claudio", "Caporaso", 5113136, 2023);
        Professor professor1 = new Professor("Simone", "Benedetti", 5131351, "JavaProgramming");
        Assistant assistant1 = new Assistant("Andrea", "Zora", 214512, true);

        student1.goToCollege();
        professor1.goToCollege();
        assistant1.goToCollege();
        System.out.println(student1.studyAtHome());
        System.out.println(professor1.teachToOtherPeople());
        System.out.println(assistant1.studyAtHome() + " " + assistant1.teachToOtherPeople());


    }
}
