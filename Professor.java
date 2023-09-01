package Lessons.Exercise.ExerciseInterfaces;

public class Professor extends CollegePerson implements TeachingPerson {
    String teachingSubject;
    public Professor(String name, String surname, int collegeId,String teachingSubject) {
        super(name, surname, collegeId);
        this.teachingSubject=teachingSubject;
    }

    @Override
    public void goToCollege() {
        super.goToCollege();
    }

    @Override
    public String teachToOtherPeople() {
        return "Sta insegnando.";
    }
}
