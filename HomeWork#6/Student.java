package myPack;
import java.util.*;
public class Student {
    private String name;
    private int course;
    static NameComparator nameComparator = new NameComparator();
    static CourseComparator courseComparator = new CourseComparator();
    public static Comparator<? super Student> getNameComparator( ) {
        return nameComparator;
    }
    public static Comparator<? super Student> getCourseComparator( ) {
        return courseComparator;
    }
    public Student(String name, int course) {
        this.course = course;
        this.name = name;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    static class NameComparator implements Comparator<Object> {
        public int compare(Object o1, Object o2) {
            return ((Student)o1).getName().compareTo(((Student)o2).getName());
        }
    }
    static class CourseComparator implements Comparator<Object> {
        public int compare(Object o1, Object o2) {
            return ((Student)o1).getCourse() - ((Student)o2).getCourse();
        }
    }
    public List<Student> printStudents(List<Student> students, Integer course){
        List<Student> result = new ArrayList<>();
        for(Student i : students){
            if (i.getCourse() == course){
                result.add(i);
            }
        }
        return result;
    }
    public String toString() {
        return "Student "+name+" course "+ course;
    }
public static void main(String[] args) {
    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student("Frodo", 5));
    studentList.add(new Student("Lolo", 7));
    studentList.add(new Student("Jerry", 11));
    studentList.add(new Student("Jeremy", 3));
    studentList.add(new Student("Lola", 1));
    studentList.sort(Student.getNameComparator());
    System.out.println(studentList);
    studentList.sort(Student.getCourseComparator());
    System.out.println(studentList);
}
}
