package ua.com.lozinska.lesson5.numberPosition;

import java.util.Scanner;

public class NumberPosition {
    static int numbers[] = new int[5];


    static void secondPositiveNumber() {
        int p = 0;
        int position = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {

                System.out.println("Negative number detected!");
                break;
            } else if ((numbers[i] > 0) && (p < 2)) {
                p++;
                position = i;
            }

        }
        if (p == 2) {
            System.out.println("Position of the second positive number is: " + (position + 1));
        } else System.out.println("There are no second positive number.");
    }

    static void findMinNumber() {
        int min = numbers[0];
        int imin = 0;
        for (
                int i = 0;
                i < numbers.length; i++) {
            if (numbers[i] < 0) {
                break;
            } else if (numbers[i] < min) {
                min = numbers[i];
                imin = i;
            }
        }
        System.out.println("Minimum = " + min + " is on " + (imin + 1) + " place.");
    }

    static void productNumbers() {
        int prod = 1;
        for (
                int i = 0;
                i < numbers.length; i++) {

            prod = prod * numbers[i];
        }
        System.out.println("Product of all numbers = " + prod);
    }


    public static void main(String[] args) {

        for (int i = 0; (i < numbers.length); i++) {
            if (numbers[i] < 0) {

                System.out.println("Negative number detected!");
                break;
            } else
                System.out.println("Please enter number");
            Scanner input = new Scanner(System.in);
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();
        NumberPosition.secondPositiveNumber();
        NumberPosition.findMinNumber();
        NumberPosition.productNumbers();
    }
}

