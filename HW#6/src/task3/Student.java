package task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Student {

	private String name;
	private Integer courseNumb;
	private static List<Student> students2 = new ArrayList<Student>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCourseNumb() {
		return courseNumb;
	}

	public void setCourseNumb(Integer courseNumb) {
		this.courseNumb = courseNumb;
	}

	public Student(String name, Integer courseNumb) {
		this.name = name;
		this.courseNumb = courseNumb;
	}

	// Printing students with course number you enter
	public static void printStudents(List<Student> students, Integer course) {
		ListIterator<Student> litr = students.listIterator();

		while (litr.hasNext()) {
			Student element = (Student) litr.next();
			if ((element.getCourseNumb().equals(course))) {
				students2.add(element);
			}

		}
		if (students2.isEmpty()) {
			System.out.println("No such course number :-(");
		} else {
			System.out.println(students2);
		}
	}

	@Override
	public String toString() {
		return "Student name: " + name + " | Course: " + courseNumb;
	}

	// Comparator by Name
	public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {
			String StudentName1 = s1.getName().toUpperCase();
			String StudentName2 = s2.getName().toUpperCase();

			return StudentName1.compareTo(StudentName2);

		}
	};

	// Comparator by Course number
	public static Comparator<Student> StuCoursComparator = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {
			Integer StudentName1 = s1.getCourseNumb();
			Integer StudentName2 = s2.getCourseNumb();

			return StudentName1.compareTo(StudentName2);

		}
	};

}
