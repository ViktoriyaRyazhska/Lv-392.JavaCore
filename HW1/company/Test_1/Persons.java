package com.company.Test_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Persons {

    private String name;
    private String surName;
    private  int age;
    private String location;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    // Constructors
    public Persons() {}

    public Persons(String name, String surName, int age, String location) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.location = location;
    }

    // Getters
    public String getName() {
        if(name != null && !name.equals("\n") && !name.equals("\t") && !name.equals(" ") && name.trim().length() > 2) {
//            return name;
        } else {
            System.out.println("\t\tError! You enter incorrect name!");
            System.out.print("\t\tPlease enter correct name: ");
            setName(name);
            getName();
        }
        return name;
    }

    public String getSurName() {
        if(surName != null && !surName.equals("\n") && !surName.equals("\t") && !surName.equals(" ") && surName.trim().length() > 2){
            return surName;
        } else {
            System.out.println("\t\tError! You enter incorrect surName!");
            System.out.println("\t\tPlease enter correct surName: ");
            setSurName(surName);
            getSurName();
        }
        return surName;
    }

    public int getAge() {
        if(age > 0 && age < 7) {
            System.out.println("Your're babe");
        } else if(age > 6 && age < 18) {
            System.out.println("Your're schoolchild ");
        } else if(age > 18 && age < 25) {
            System.out.println("Your're student ");
        } else if(age > 25&& age < 60) {
            System.out.println("Your're working person ");
        } else if(age > 60 && age < 90) {
            System.out.println("Your're pensioner ");
        } else{
            System.out.println("\t\tError! You enter incorrect age!");
            System.out.print("\t\tPlease enter correct age: ");
            setAge(age);
            getAge();
        }
        return age;
    }

    public String getLocation() {
        if(location != null && location.equals("\t") && location.equals(" ") && location.equals("\n") && location.trim().length() > 2) {
            return location;
        } else {
            System.out.println("\t\tError! You enter incorrect location!");
            System.out.println("\t\tPlease enter correct location: ");
            setLocation(location);
            getLocation();
        }
        return location;
    }

    // Setters
    public void setName(String name) {
        try{
            name = br.readLine();
        } catch(IOException e) {
            e.printStackTrace();
        }
        this.name = name;
    }

    public void setSurName(String surName) {
        try{
            surName = br.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        this.surName = surName;
    }

    public void setAge(int age) {
        try{
            age = Integer.parseInt(br.readLine());
        } catch(IOException e) {
            e.printStackTrace();
        }
        this.age = age;
    }

    public void setLocation(String location) {
        try{
            location = br.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        this.location = location;
    }

    public void showName() {
        System.out.printf("person name: \t%s\n", getName());
    }
}
