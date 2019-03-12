package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    private String name;
    private String surName;
    private  int age;
    private String location;

    Person() {}
    Person(String name, String surName, int age, String location) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.location = location;
    }

    public String getName() {
        if(name != null && !name.equals("\n")  && !name.equals("\t") && !name.equals(" ")){
            return name;
        } else{
            System.out.println("\t\tError! You enter incorrect name!");
            System.out.print("\t\tPlease enter correct name: ");
            try {
                name = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            getName();
            return name;
        }
    }

    public void setName(String name) {
//        try {
            name = getName();
            this.name = name;
            if(name != null && !name.equals("\n")  && !name.equals("\t") && !name.equals(" ")){
            } else{
                System.out.println("\t\tError! You enter incorrect name!");
                System.out.print("\t\tPlease enter correct name: ");
                setName(name);
            }
/*        } catch (IOException e) {
            e.printStackTrace();
        }*/
        this.name = name;
    }

    public String getSurName() {
        if(surName != null && surName != "\n" && surName != "\t" && surName != " ") {
            return  surName;
        } else {
            System.out.println("\t\tError! You enter incorrect surname!");
            System.out.print("\t\tPlease enter correct surname: ");
            try {
                surName = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            getSurName();
            return surName;
        }
    }

    public void setSurName(String surName) {
        try {
            surName = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.surName = surName;
    }

    public int getAge() {
        if(age > 0 && age < 80) {
            return age;
        } else{
            System.out.println("\t\tError! You enter incorrect age!");
            System.out.print("\t\tPlease enter correct age: ");
            try {
                age = Integer.parseInt(br.readLine());
                getAge();
                return  age;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return age;
    }

    public void setAge(int age) {
        if(age < 0 && age < 80) {
            this.age = age;
        } else {
            System.out.println("\t\tError! You enter incorrect age!");
            return;
        }
    }

    public String getLocation() {
        if(location != null) {
            return location;
        } else {
            System.out.println("\t\tError! You enter incorrect location!");
            System.out.print("\t\tPlease enter correct location: ");
            try {
                location = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            getLocation();
            return location;
        }
    }

    public void setLocation(String location) {
        try {
            location = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.location = location;
    }

    public void showInfo() {
        System.out.printf("Persons - %s %s. Age is %d year. Live in %s.\n", getName(), getSurName(), getAge(), getLocation());
    }
}
