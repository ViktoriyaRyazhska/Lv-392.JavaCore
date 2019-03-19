package com.company;

import java.io.BufferedReader;
import java.io.IOException;

import static com.company.Main.br;

public class DayRegistration {

    /**
     * This method get the parameter String line, and check it in switch.
     * looking for coincidence in switch expression:
     * - if yes: call the chooseLanguage() method
     * -if no: recursion method repeatedly to check the parameter String line
     * @param line
     * @throws IOException
     */
    public void getNameDay(String line) throws IOException {
        if(line != null) {
            switch (line.toLowerCase()) {
                case "monday":
                    DayOfWeek.MONDAY.getEng();
                    chooseLanguage(br, DayOfWeek.MONDAY);
                    break;
                case "tuesday":
                    DayOfWeek.TUESDAY.getEng();
                    chooseLanguage(br, DayOfWeek.TUESDAY);
                    break;
                case "wednesday":
                    DayOfWeek.WEDNESDAY.getEng();
                    chooseLanguage(br, DayOfWeek.WEDNESDAY);
                    break;
                case "thursday":
                    DayOfWeek.THURSDAY.getEng();
                    chooseLanguage(br, DayOfWeek.THURSDAY);
                    break;
                case "friday":
                    DayOfWeek.FRIDAY.getEng();
                    chooseLanguage(br, DayOfWeek.FRIDAY);
                    break;
                case "Saturday":
                    DayOfWeek.SATURDAY.getEng();
                    chooseLanguage(br, DayOfWeek.SATURDAY);
                    break;
                case "sunday":
                    DayOfWeek.SUNDAY.getEng();
                    chooseLanguage(br, DayOfWeek.SUNDAY);
                default:
                    System.out.println("Error! Please repeat:");
                    getNameDay(putLine(br));
                    break;
            }
        } else {
            System.out.println("Error null! Please repeat:");
            getNameDay(putLine(br));
        }
    }

    /**
     * This method output the result (day) appropriate language
     * If the incorrect language selection this method performs recursion
     * @param br  Instance class BufferedReader
     * @param day
     * @throws IOException
     */
    public void chooseLanguage(BufferedReader br, DayOfWeek day) throws IOException {
        System.out.println("Enter language: eng / ua / rus");
        String line = br.readLine();
        if(line.toLowerCase().equals("eng")) {
            day.getEng();
            System.out.printf("The day is %s!\n", day.getEng().toLowerCase());
        } else if(line.toLowerCase().equals("ua")) {
            day.getUa();
            System.out.printf("День - %s!\n", day.getUa().toLowerCase());
        } else if(line.toLowerCase().equals("rus")) {
            day.getRus();
            System.out.printf("День - %s!\n", day.getRus().toLowerCase());
        } else{
            System.out.println("Error!");
            chooseLanguage(br, day);
        }
    }

    /**
     * User entered the day of the week in console.
     * The input options are shown in brackets.
     * @param br  Instance class BufferedReader
     * @return
     * @throws IOException
     */
    public String putLine(BufferedReader br) throws IOException {
        System.out.println("Enter name day example: monday / tuesday / wednesday / thursday / Friday / Saturday / Sunday");
        String line = null;
        line = br.readLine();
        return line;

    }

}
