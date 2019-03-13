package ua.com.lozinska.lesson3;

public class Person {
    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person() {
    }


    public Person(String name, int birthYear) {
        super();
        this.name = name;
        this.birthYear = birthYear;
    }

    public int getAge() {
        return 2019 - birthYear;
    }

    @Override
    public String toString() {
        return "Person " + this.name + " birth in " + this.birthYear + " year. Age: " + this.getAge() + ".";
    }

    public void changeName(String newName) {
        name = newName;

    }

}


