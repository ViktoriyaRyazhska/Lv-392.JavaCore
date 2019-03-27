import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	
	private String name;
	private Integer course;
	private static NameCompare nameComp = new NameCompare();
	private static CourseCompare courseComp = new CourseCompare();
	
	public Student(String name) {
		this.name = name;
	}
	public Student(Integer course) {
		this.course = course;
	}
	public Student(String name, Integer course) {
		this.name = name;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    public Integer getCourse() {
		return course;
	}

	public void setCourse(Integer course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student name = " + name + ", course = " + course;
	}
	
	public static String printStudents(List<Student> students, Integer course) {
		String string = course + "th year students: ";
		for (Iterator<Student> iterator = students.iterator(); iterator.hasNext();) {
			Student student = iterator.next();
			if (student.course == course) {
				string += "[" + student.getName() + "]";
			}
		}
		if (string == course + "th year students: ") {
			return "There are no such students";
		} else {
			return string;
		}
}	
	public static Comparator<Student> getNameComparator(){
		return nameComp;
	}
	public static Comparator<Student> getCourseComparator(){
		return courseComp;
	}
	
	static class NameCompare implements Comparator<Student>{

		@Override
		public int compare(Student s1, Student s2) {
			return s1.getName().compareTo(s2.getName());
		}
	}

	static class CourseCompare implements Comparator<Student>{

		@Override
		public int compare(Student s1, Student s2) {
			return s1.getCourse() - s2.getCourse();
		}
	}

	public static void main(String[]args)  {
		List<Student> student = new ArrayList<Student>();
		student.add(new Student("Vasya", 4));
		student.add(new Student("Petro", 2));
		student.add(new Student("Kolya", 2));
		student.add(new Student("Olya", 1));
		student.add(new Student("Katya", 5));
		System.out.println(student);

		
		System.out.println(printStudents(student, 2));
		
		student.sort(Student.getNameComparator());
		System.out.println(student);
		student.sort(Student.getCourseComparator());
		System.out.println(student);

		


		
		
		
		
	}


}
