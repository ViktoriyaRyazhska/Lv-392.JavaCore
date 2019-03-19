package com.company;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person{

    private long id;
    private double salary;
    private Date startWork;
    protected GregorianCalendar calendarStartWork;

    // Constructors


    public Employee() {
        super();
    }

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Employee(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth, long id) {
        super(firstName, lastName, yearOfBirth, monthOfBirth, dayOfBirth);
        this.id = id;
    }

    public Employee(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth, long id, int yearOfStartWork, int monthOfStartWork, int dayOfStartWork, int salary) {
        super(firstName, lastName, yearOfBirth, monthOfBirth, dayOfBirth);
        this.id = id;
        calendarStartWork = new GregorianCalendar(yearOfStartWork, monthOfStartWork-1, dayOfStartWork);
        this.startWork = calendarStartWork.getTime();
        this.salary = salary;
    }

    // getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getStartWork() {
        return startWork;
    }

    public void setStartWork(Date startWork) {
        this.startWork = startWork;
    }

    public GregorianCalendar getCalendarStartWork() {
        return calendarStartWork;
    }

    public void setCalendarStartWork(GregorianCalendar calendarStartWork) {
        this.calendarStartWork = calendarStartWork;
    }
}
