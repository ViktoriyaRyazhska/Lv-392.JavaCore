package com.company;

import com.company.Test_1.Persons; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main { 


//    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

//        try {
//            String name = br.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Person person1 = new Person("Ihor", "Petrow", 25, "Lviv");
//        person1.showInfo();
//
//        Person person2 = new Person();
//        Scanner scan = new Scanner(System.in);
//        person2.setName(scan.nextLine());
//        System.out.printf("person2 - %s\n", person2.getName());
//        person2.showInfo();



    Persons persons1 = new Persons();
    persons1.showName();
    }
}
