package ua.com.lozinska.lesson5.monthNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the number of month, please: ");
        int monthNum = Integer.parseInt(br.readLine());

        int result = MonthNumber.monthNumber(monthNum);
        if (result == -1) {
            System.out.println("Wrong month number!");
        } else {
            System.out.println("There are " + result + " days in month number " + monthNum);
        }
    }

}
