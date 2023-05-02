package grades;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class GradeApplication {
    public static void main(String[] args) {
        HashMap<String, Student>students = new HashMap<>();

        Student savanna = new Student("smccauley");
        savanna.addGrade(90);
        savanna.addGrade(95);
        savanna.addGrade(100);

        Student lucas = new Student("lukebo");
        lucas.addGrade(70);
        lucas.addGrade(80);
        lucas.addGrade(90);

        Student chell= new Student("chellm");
        chell.addGrade(40);
        chell.addGrade(100);
        chell.addGrade(32);

        Student polly = new Student("pollygirl");
        polly.addGrade(43);
        polly.addGrade(60);
        polly.addGrade(100);

       students.put(savanna.getName(), savanna);
       students.put(lucas.getName(), lucas);
       students.put(chell.getName(), chell);
       students.put(polly.getName(), polly);

//       for(Student student: students.values()){
//           System.out.println(student.getName());
//           System.out.println(student.getGradeAverage());
//       }
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("Here are the GitHub usernames of our students:");
        for (String name : students.keySet()){
            System.out.print(" | " +name+ " | ");
        }
        System.out.println("");

    }
}
