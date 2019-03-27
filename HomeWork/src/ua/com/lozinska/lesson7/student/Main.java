package ua.com.lozinska.lesson7.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anton", 2));
        students.add(new Student("Bogdan", 1));
        students.add(new Student("Roman", 2));
        students.add(new Student("Alina", 2));
        students.add(new Student("Vova", 1));

        Main.printStudent(students);
        Main.sortByCourse(students);
        Main.sortByName(students);
    }

    private static void printStudent(List<Student> students) {

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getStudentName());
        }
        System.out.println();
    }

    public static void sortByName(List<Student> students) {
        students.sort(new NameComparator());
        System.out.println("Students sorted by name: ");
        for (Student student : students) {

            System.out.println(student.getStudentName() + " " + student.getCourse());

        }
        System.out.println();
    }

    public static void sortByCourse(List<Student> students) {

        students.sort(new CourseComparator());
        System.out.println("Students sorted by course: ");

        for (Student student : students) {

            System.out.println(student.getStudentName() + " " + student.getCourse());

        }
        System.out.println();

    }
}
