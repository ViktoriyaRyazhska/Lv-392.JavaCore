package ua.com.lozinska.taskN.taskN10;

import java.util.Scanner;

public class StepsNumber {
    public static void getStepsNumber() {
        System.out.println("10. Find the number of" +
                " steps for which you get 1, using the" +
                " following process: we take any\n" +
                "the natural number n is greater than " +
                "one. If it is even, then divide it by " +
                "2, and if it is odd, then\n" +
                "multiply by 3 and add 1");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n = scan.nextInt();

        int stepsNumber = 0;
        int expectedValue = 0;

        while (expectedValue != 1) {
            if (n % 2 == 0) {
                expectedValue = n / 2;
            } else {
                expectedValue = (n * 3) + 1;
            }

            n = expectedValue;
            stepsNumber = stepsNumber + 1;
        }
        System.out.println("Number of steps to get 1 = " + stepsNumber);
    }

}

