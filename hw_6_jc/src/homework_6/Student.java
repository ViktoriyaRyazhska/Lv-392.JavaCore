package homework_6;


public class Student {
    private String name;
    private int course;

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

}
