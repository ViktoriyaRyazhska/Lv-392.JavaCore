package com.company.del;

import java.util.Date;
import java.util.GregorianCalendar;

public class Person_2 {

    private String firstName;
    private String lastName;
    private Date birthday;
    protected GregorianCalendar calendar;



    // constructors
    public Person_2() {
    }

    public Person_2(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person_2(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this(firstName, lastName);
        calendar = new GregorianCalendar(yearOfBirth, monthOfBirth-1, dayOfBirth);
        this.birthday = calendar.getTime();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public GregorianCalendar getCalendar() {
        return calendar;
    }

    public void setCalendar(GregorianCalendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String fullName() {
        String s = String.format("Person %s %s", getFirstName(), getLastName());
        return s;
    }
}
