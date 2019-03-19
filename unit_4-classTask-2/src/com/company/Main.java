package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Exercise:
 * 2. Enter the number of the day of the week. Display the name in three languages.
 */
public class Main {

    DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private  static DayRegistration dayRegistration = new DayRegistration();
    private static Main main = new Main();
    private static Services services = new Services();

    public static void main(String[] args) throws IOException {

        System.out.println(DayOfWeek.FRIDAY.getEng());
        System.out.println(DayOfWeek.MONDAY.getUa());
        System.out.println(DayOfWeek.THURSDAY.getRus());

        int dayNumb = DayOfWeek.FRIDAY.ordinal()+1;
        System.out.printf("№ %d - %s!\n", dayNumb, DayOfWeek.FRIDAY.getEng());


        DayOfWeek sunday = DayOfWeek.valueOf("SUNDAY");
        System.out.println("\t\tsunday use method .valueOf() - " + sunday);


        System.out.println("!!!!!!!!!!!!!");
        System.out.println("array : " + Arrays.toString(DayOfWeek.values()));
        System.out.println("!!!!!!!!!!!!!");
        System.out.println("arrays : " + Arrays.deepToString(DayOfWeek.values()));
        System.out.println("!!!!!!!!!!!!!");


        List<String> arrayDays = Collections.singletonList(Arrays.toString(DayOfWeek.values()));    //That didn't understand!!!!!!!!!!!!
        for(String s : arrayDays) {
            int counter = 1;
            System.out.printf("day № %d\t-\t%s\n", counter, s);
            ++counter;
        }

        System.out.println();
        System.out.println();

        dayRegistration.getNameDay(dayRegistration.putLine(br));
        dayRegistration.getNameDay(dayRegistration.putLine(br));



    }

}
