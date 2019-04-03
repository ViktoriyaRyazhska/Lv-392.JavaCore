package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Put course number you need: ");

		int putCourse = Integer.parseInt(br.readLine());
		List<Student> students = new ArrayList<Student>();

		students.add(new Student("Taras", 11));
		students.add(new Student("Ivan", 33));
		students.add(new Student("Stepan", 11));
		students.add(new Student("Oleg", 44));
		students.add(new Student("Misha", 33));

		Student.printStudents(students, putCourse);
		System.out.println();

		System.out.println("Sorting students by name: ");
		Collections.sort(students, Student.StuNameComparator);
		for (Student str : students) {
			System.out.println(str);
		}
		System.out.println();
		System.out.println("Sorting students by cours number: ");
		Collections.sort(students, Student.StuCoursComparator);
		for (Student str : students) {
			System.out.println(str);
		}

	}

}
