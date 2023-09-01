package Lessons.Exercise.ExerciseInterfaces;

public class Student extends CollegePerson implements LearningPerson {
    int academicYear;

    public Student(String name, String surname, int collegeId, int academicYear) {
        super(name, surname, collegeId);
        this.academicYear = academicYear;
    }

    @Override
    public void goToCollege() {
        super.goToCollege();
    }

    @Override
    public String studyAtHome() {
        return "Studiando";
    }
}
