package com.company;

public class Person {
    private String name;
    private int age;
    private DayRegistration dayRegistration;
    private DayOfWeek day;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

/*
    public Person(String name, int age, DayRegistration dayRegistration) {
        this.name = name;
        this.age = age;
        this.dayRegistration = dayRegistration;
    }
*/

    public Person(String name, int age, DayOfWeek day) {
        this.name = name;
        this.age = age;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("you entered name:");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("you entered age:");
        this.age = age;
    }

    public DayRegistration getDayRegistration() {
        return dayRegistration;
    }

    public void setDayRegistration(DayRegistration dayRegistration) {
        this.dayRegistration = dayRegistration;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }
}
