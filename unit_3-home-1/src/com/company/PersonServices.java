package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class PersonServices {

    private static GregorianCalendar calendar = new GregorianCalendar();



    /**
     * this method calculate age Person and extends classes.
     * @param p instance class Person
     * @return
     */
    public int calculateAge(Person p) {
/*        if(p.getCalendar().after(calendar.getActualMaximum(Calendar.YEAR))) {
            throw new IllegalArgumentException("Can't be born  in the future");
        }*/
        int years =calendar.get(Calendar.YEAR) - p.getCalendar().get(Calendar.YEAR);
//        System.out.printf("year %1$d = %3$d - %2$d \n", years, p.getCalendar().get(Calendar.YEAR), calendar.get(Calendar.YEAR));
        return  years;
    }

    /**
     * this method calculate age which person working in this company.
     *
     * @param emp instance class
     */
    public int calculateAgeWork(Employee emp) {
/*
        if(emp.getCalendarStartWork().get(Calendar.YEAR) != 0) {
            int years = calendar.get(Calendar.YEAR) - emp.getCalendarStartWork().get(Calendar.YEAR);
            System.out.println("years = " + years);
            return years;
        } else {}
*/
            int years = calendar.get(Calendar.YEAR) - emp.getCalendarStartWork().get(Calendar.YEAR);
            return years;
    }

    /**
     * This method reads the data entered by the user in the console.
     * Assigns the entered data to the corresponding fields and methods
     * of the class Person
     * @param p Instance class Person
     * @param br Instance class BufferedReader
     * @throws IOException
     */
    public void inputInfoPerson(Person p, BufferedReader br) throws IOException {
        System.out.println("Enter name:");
        String name = br.readLine();
        p.setFirstName(name);
        System.out.println("Enter surname:");
        String surname = br.readLine();
        p.setLastName(surname);
        System.out.println("Enter year Of Birth:");
        int year = Integer.parseInt(br.readLine());
        System.out.println("Enter month Of Birth:");
        int month = Integer.parseInt(br.readLine());
        System.out.println("Enter day Of Birth:");
        int day = Integer.parseInt(br.readLine());
        // use method setCalendarStartWork
        p.setCalendar(new GregorianCalendar(year, month, day));
        // create Date startWork and assign  parameters
        Date birthday = calendar.getTime();
        p.setBirthday(birthday);
    }

    /**
     * This method reads the data entered by the user in the console.
     * Assigns the entered data to the corresponding fields and methods
     * of the class Employee
     * @param emp Instance class Employee
     * @param br Instance class BufferedReader
     * @throws IOException
     */
    public void inputInfoEmployee(Employee emp, BufferedReader br) throws IOException {
//        System.out.println("Enter name:");
//        String name = br.readLine();
//        emp.setFirstName(name);
//        System.out.println("Enter surname:");
//        String surname = br.readLine();
//        emp.setLastName(surname);
//        System.out.println("Enter year Of Birth:");
//        int yearOfBirth = Integer.parseInt(br.readLine());
//        System.out.println("Enter month Of Birth:");
//        int monthOfBirth = Integer.parseInt(br.readLine());
//        System.out.println("Enter day Of Birth:");
//        int dayOfBirth = Integer.parseInt(br.readLine());
//        emp.setCalendar(new GregorianCalendar(yearOfBirth, monthOfBirth, dayOfBirth));

        inputInfoPerson((Person) emp, br);

        System.out.println("Enter ID:");
        long id = Long.parseLong(br.readLine());
        emp.setId(id);

        System.out.println("Enter year of start work:");
        int yearOfStartWork = Integer.parseInt(br.readLine());
        System.out.println("Enter month of start work:");
        int monthOfStartWork = Integer.parseInt(br.readLine());
        System.out.println("Enter day of start work:");
        int dayOfStartWork = Integer.parseInt(br.readLine());
        // use method setCalendarStartWork
        emp.setCalendarStartWork(new GregorianCalendar(yearOfStartWork, monthOfStartWork, dayOfStartWork));

        // create Date startWork and assign  parameters
        Date startWork = calendar.getTime();
        emp.setStartWork(startWork);

        System.out.println("Enter salary:");
        int salary = Integer.parseInt(br.readLine());
        emp.setSalary(salary);
    }

    /**
     * this method show and output info about Person .
     * @param p instance class Person
     */
    public void outputPer(Person p) {
        String s = String.format("%1$s,\n\t\tbirthday: %2$td.%2$tB.%2$tY\tage - %3$d\n", fullName(p), p.getBirthday(), calculateAge(p));
        System.out.println(s);
    }

    /**
     * this method show and output info about Employee.
     * @param emp instance class Employee
     */
    public void outputEmp(Employee emp) {
        String s = String.format("%1$s,\tID : %5$d\n\t\tbirthday: %2$td.%2$tB.%2$tY\tage - %3$d\n\t\t" +
                "start work %4$td.%4$tB.%4$tY\tyou working - %6$d years\n\t\tsalary = %7$,.3f$\n",
                fullName((Person)emp), emp.getBirthday(), calculateAge(emp), emp.getStartWork(), emp.getId(), calculateAgeWork(emp), emp.getSalary());
        System.out.println(s);
    }

    /**
     *
     * @param p instance class Person
     * @return
     */
    public String fullName(Person p) {
        String s = String.format("Person %s %s", p.getFirstName(), p.getLastName());
        return s;
    }

    /**
     *
     * @param p instance class Person
     * @param br Instance class BufferedReader
     * @return
     * @throws IOException
     */
    public String changeName(Person p, BufferedReader br) throws IOException {
        System.out.println("Enter name:");
        String newFirstName = br.readLine();
        p.setFirstName(newFirstName);
        System.out.println("Enter surname:");
        String newLasttName = br.readLine();
        p.setLastName(newLasttName);
//        System.out.printf("New full name: %s %s\n", p.getFirstName(), p.getLastName());
        System.out.printf("New full name: %s\n", fullName(p));
        return fullName(p);
    }











}
