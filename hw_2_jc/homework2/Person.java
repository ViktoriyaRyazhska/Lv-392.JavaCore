package homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {

    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int age() {
        LocalDate localDate = LocalDate.now();
        return localDate.getYear() - birthYear;
    }

    public void output(){
        if (name != null && birthYear > 0){
            System.out.println(toString());
        } else if (name != null && birthYear == 0){
            System.out.println("name : " + name + ".");
        } else if (name == null && birthYear != 0){
            System.out.println("Unknown person, birth year : " + birthYear +
                               ", " + "age : " + age() + ".");
        }else{
            System.out.println("Person's info is empty.");
        }
    }

    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name : ");
        String name = br.readLine();

        System.out.println("Enter the birth year : ");
        int birthYear = Integer.parseInt(br.readLine());

        if (name.length() > 0){ setName(name); }
        if (birthYear > 0) { setBirthYear(birthYear); }
    }

    public void changeName(String name){
        if (name.length() > 0){ setName(name); }
    }

    @Override
    public String toString() {
        return "name : " + name + ", " + "birth year : " + birthYear + ", " + "age : " + age() + ".";
    }
}
