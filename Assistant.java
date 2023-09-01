package Lessons.Exercise.ExerciseInterfaces;

public class Assistant extends CollegePerson implements LearningPerson,TeachingPerson{
    boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD=isGoingToBeAPhD;
    }
    @Override
    public void goToCollege() {
        super.goToCollege();
    }

    @Override
    public String studyAtHome() {
        return "Assistente aiuta a studiare";
    }

    @Override
    public String teachToOtherPeople() {
        return "Assistente aiuta ad insegnare";
    }
}
