package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer>grades;
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }
    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int sum = 0;
        for(int grade :grades) {
            sum += grade;
        }
        if( grades.size() > 0){
            return (double) sum / grades.size();
        }else{
            return 0;
        }
    }



}
