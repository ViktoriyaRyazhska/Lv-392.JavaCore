package ua.com.lozinska.lesson8.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class USCurrency {
    public static void main(String[] args) {
        List<Double> myCurrencies = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {

            Scanner scan = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Please enter the value:");
            double currency = scan.nextDouble();
            myCurrencies.add(i, currency);

        }
        System.out.println("List of currencies:");

        for (int i = 0; i < 5; i++) {
            String format = "%10.2f";
            String s = String.format(format, myCurrencies.get(i));
            System.out.println("$" + s);

        }
    }
}
