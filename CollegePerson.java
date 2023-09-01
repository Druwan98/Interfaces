package Lessons.Exercise.ExerciseInterfaces;

public abstract class CollegePerson {
    String name;
    String surname;
    int collegeId;

    public CollegePerson(String name, String surname, int collegeId) {
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }

    public void goToCollege() {
        System.out.println("Name: " + name + "\nSurname: " + surname + "\nCollegeID :" + collegeId);
    }


}
