package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestClass_LocalDate {
    public static void main(String[] args) {

        LocalDate birthday =LocalDate.of(1989, 5, 12);
        LocalDate dayOfStartWork = LocalDate.of(2000, 5, 15);

        long daysBetween = ChronoUnit.DAYS.between(birthday, dayOfStartWork);

//        long hours = ChronoUnit.HOURS.between(birthday, dayOfStartWork);
        System.out.println("daysBetween = " + daysBetween);
//        System.out.println("hours = " + hours);




    }
}
