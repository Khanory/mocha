package model;

import java.util.List;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String className;
    private List<Grade> grades;

    public Student(int id, String firstName, String lastName, String className, List<Grade> grades) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.className = className;
        this.grades = grades;
    }
    public Student(int id, String firstName, String lastName, String className) {
        this(id, firstName, lastName, className, null);
    }
    public int getId() {return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getClassName() { return className; }
    public List<Grade> getGrades() {return grades; }
    public void setGrades(List<Grade> grades) { this.grades = grades; }

    public double getAverage() {
        if(grades == null || grades.isEmpty()) return 0;
        double sum = 0;
        int totalWeight = 0;
        for (Grade g : grades) {
            sum += g.getGrade() * g.getWeight();
            totalWeight += g.getWeight();
        }
        return totalWeight == 0 ? 0 : sum / totalWeight;
    }
}
