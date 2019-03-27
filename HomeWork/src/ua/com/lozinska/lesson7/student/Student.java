package ua.com.lozinska.lesson7.student;

import java.util.Iterator;
import java.util.List;

public class Student {
    private String studentName;
    private int course;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String studentName, int course) {
        this.studentName = studentName;
        this.course = course;
    }
}