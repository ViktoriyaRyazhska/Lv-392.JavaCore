package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Exercise:
 *
 * Create Console Application project in Java.
 * Add class Person to the project.
 * Class Person should consists of
 * 1. two private fields: name and birthYear (the birthday year)
 * 2. properties for access to these fields
 * 3. default constructor and constructor with 2 parameters
 * 4. methods:
 * 	age - to calculate the age of person
 * 	input - to input information about person
 * 	output - to output information about person
 * 	changeName - to change the name of person
 *
 * In the method main() create 5 objects of Person type and input information about them.
 *
 */
public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PersonServices personServices = new PersonServices();

    public static void main(String[] args) throws IOException {
	// write your code here

        Person p1 = new Person("Max", "Petrov", 1945, 10, 25);
        System.out.println("p1 age = " + personServices.calculateAge(p1));
        personServices.outputPer(p1);

        System.out.println("!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!");


        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Ivan", "Ivanov", 1961, 12, 5));
        persons.add(new Person("Karl", "Bodrov", 1978, 5, 12));
        persons.add(new Person("Ilon", "Mask", 1992, 3, 22));
        persons.add(new Person("Stiven", "Bushmi", 2001, 11, 1));
        persons.add(new Person("Inna", "Albekova", 1989, 1, 9));
        persons.add(new Person("Ilona", "Kornell", 2000, 6, 25));
        persons.add(new Person("Alisa", "Fine", 1976, 2, 7));
        persons.add(new Person("Viktoria", "Horstman", 1983, 9, 12));
        persons.add(new Person("Nelly", "Kirova", 1991, 11, 15));
        persons.add(new Person("Andrii", "Petrov", 1986, 2, 9));

        if(!persons.isEmpty()) {
            Collections.shuffle(persons);
            for(Person p : persons) {
                personServices.outputPer(p);
            }
        }


        System.out.println("=================");
        System.out.println("=================");
        System.out.println("=================");

        Employee emp1 = new Employee("Ivan", "Ivanov", 1961, 12, 5, 12558900);
        Employee emp2 = new Employee("Max", "Petrow", 1961, 12, 5, 12558900, 2005, 12, 22, 12500);
        personServices.outputEmp(emp2);
        personServices.calculateAgeWork(emp2);


        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Max100", "Petrow100", 1940, 10, 5, 12558900, 1965, 12, 22, 12500));
        employees.add(new Employee("Max101", "Petrow101", 1942, 8, 15, 12558901, 1970, 12, 22, 12500));
        employees.add(new Employee("Max102", "Petrow102", 1944, 6, 10, 12558902, 1968, 12, 22, 12500));
        employees.add(new Employee("Max103", "Petrow103", 1946, 4, 2, 12558903, 1972, 12, 22, 12500));
        employees.add(new Employee("Max104", "Petrow104", 1948, 2, 4, 12558904, 1974, 12, 22, 12500));
        employees.add(new Employee("Max105", "Petrow105", 1950, 1, 6, 12558905, 1977, 12, 22, 12500));
        employees.add(new Employee("Max106", "Petrow106", 1955, 3, 8, 12558906, 1980, 12, 22, 12500));
        employees.add(new Employee("Max107", "Petrow107", 1960, 5, 10, 12558907, 1985, 12, 22, 12500));
        employees.add(new Employee("Max108", "Petrow108", 1965, 7, 12, 12558908, 1983, 12, 22, 12500));
        employees.add(new Employee("Max109", "Petrow109", 1970, 9, 14, 12558909, 2005, 12, 22, 12500));

        if(!employees.isEmpty()) {
            Collections.shuffle(employees);
            for(Employee emp : employees) {
                personServices.outputEmp(emp);
            }
        }
        System.out.println("!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!");


        /**
         * Enter parameters for instance class Person from console use BufferedReader
         */
/*
        Person person = new Person();
        personServices.inputInfoPerson(person, br);
        int a = personServices.calculateAge(person);
        System.out.println("int age a = " + a);
        personServices.outputPer(person);
*/
        /**
         * Enter parameters for instance class Employee from console use BufferedReader
         */
/*
        Employee employee = new Employee();
        personServices.inputInfoEmployee(employee, br);
        int b = personServices.calculateAgeWork(employee);
        System.out.println("int age b = " + b);
        personServices.outputEmp(employee);
*/

        Person person2 = new Person("Ivan", "Ivanov", 1961, 12, 5);
        personServices.outputPer(person2);
        personServices.changeName(person2, br);
        System.out.println("!!!!!!!");
        personServices.outputPer(person2);

    }


}
