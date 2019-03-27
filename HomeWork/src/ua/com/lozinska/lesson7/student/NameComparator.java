package ua.com.lozinska.lesson7.student;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    @Override

    public int compare(Student o1, Student o2) {

        return o1.getStudentName().compareTo(o2.getStudentName());
    }
}
