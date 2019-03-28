package homework_6;


import java.util.*;

public class ThirdTask {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("John", 1));
        studentList.add(new Student("Jack", 2));
        studentList.add(new Student("Tom", 3));
        studentList.add(new Student("Rory", 4));
        studentList.add(new Student("Liza", 1));

        studentList.sort(Student.getCourseComparator());
        System.out.println(studentList);

        studentList.sort(Student.getNameComparator());
        System.out.println(studentList);
    }
}
