package ua.edu.softserve.homework.hw6.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
//		student.printStudents(List<Student>, course);
		List<Student> list = new ArrayList();

		list.add(new Student("David", 5));

		list.add(new Student("Zak", 1));

		list.add(new Student("Helen", 4));

		list.sort(new NameComparator());

		for (Student employee : list) {

			System.out.println(employee);

		}

		list.sort(new CourseComparator());

		for (Student employee : list) {

			System.out.println(employee);

		}
		
	}

}
