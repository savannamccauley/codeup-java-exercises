package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Savanna");
        Student student2 = new Student("Lucas");
        Student student3 = new Student("Bonner");

        student1.addGrade(100);
        student1.addGrade(88);
        student1.addGrade(30);
        student2.addGrade(100);
        student3.addGrade(100);

    }
}
