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

//        List<Student> sortedName = new ArrayList(Student.getNameComparator());
//        sortedName.addAll(studentList);
//
//        List<Student> sortedCourse = new ArrayList(Student.getCourseComparator());
//        sortedCourse.addAll(studentList);


        //нерозумію чому виходить зробити це тільки через Set, з лістами виходить error
        Set<Student> set1 = new TreeSet(Student.getCourseComparator());
        set1.addAll(studentList);

        System.out.println(set1);

        Set<Student> set2 = new TreeSet(Student.getNameComparator());
        set2.addAll(studentList);

        System.out.println(set2);

    }
}
