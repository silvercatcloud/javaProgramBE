package org.example.pojo;

public class Score {
    private int courseId;
    private String courseName;
    private double score;
    private int studentId;
    public Score(int courseId, String courseName, double score, int studentId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.score = score;
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getScore() {
        return score;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


}
