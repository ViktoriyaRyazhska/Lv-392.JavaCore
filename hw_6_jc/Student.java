package homework_6;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    static NameComparator nameComparator = new NameComparator();
    static CourseComparator courseComparator = new CourseComparator();

    public static Comparator getNameComparator( ) {
        return nameComparator;
    }
    public static Comparator getCourseComparator( ) {
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

    static class NameComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            return ((Student)o1).getName().compareTo(((Student)o2).getName());
        }
    }
    static class CourseComparator implements Comparator {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
