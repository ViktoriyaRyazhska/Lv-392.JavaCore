package ua.edu.softserve.homework.hw6.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {

	private String name;
	private int course;

	public Student() {
		super();
	}

	public Student(String name, int course) {
		super();
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	void printStudents(List name, Integer course) {
		List<Student> list = new ArrayList();

		for (Student stud : list) {

			
		}

	}
}

class NameComparator implements Comparator<Student> {

	@Override

	public int compare(Student o1, Student o2) {

		return o1.getName().compareTo(o2.getName());

	}

}

class CourseComparator implements Comparator<Student> {

	@Override

	public int compare(Student o1, Student o2) {

		return o1.getCourse() - o2.getCourse();

	}

}