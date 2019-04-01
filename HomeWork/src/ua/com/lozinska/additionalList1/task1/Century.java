package ua.com.lozinska.additionalList1.task1;

import java.util.Scanner;

public class Century {
    public static void main(String[] args) {
        int century;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the year:");
        int year = scan.nextInt();

        if (((year % 10) + (year % 100)) > 0) {
            century = year / 100 + 1;
        } else {
            century = year / 100;
        }

        System.out.println("Year " + year + " belongs to " + century + " century.");
    }
}
