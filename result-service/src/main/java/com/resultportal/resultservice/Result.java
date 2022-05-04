package com.resultportal.resultservice;

import org.springframework.data.annotation.Id;

public class Result {

    @Id
    private String id;
    private int rollNum;
    private String course;
    private double marks;
    private double totalMarks;

    public Result(){}

    public Result(int rollNum, String course, double marks, double totalMarks){
        this.rollNum = rollNum;
        this.course = course;
        this.marks = marks;
        this.totalMarks = totalMarks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id='" + id + '\'' +
                ", rollNum=" + rollNum +
                ", course='" + course + '\'' +
                ", marks=" + marks +
                ", totalMarks=" + totalMarks +
                '}';
    }
}
