package model;

public class Grade {
    private int id;
    private int studentId;
    private String subject;
    private double grade;
    private int weight;
}

public Grade(int id, int studentId, String subject, double grade, int weight){
    this.id = id;
    this.studentId = studentId;
    this.subject = subject;
    this.grade = grade;
    this.weight = weight;
}

public Grade(int studentId, String subject, double grade, int weight) {

}
