package ua.com.lozinska.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonalInformation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("Where are you live, "+ name + "?");
        String adress= br.readLine();

        System.out.println(name + " lives in " + adress +".");
    }

}

