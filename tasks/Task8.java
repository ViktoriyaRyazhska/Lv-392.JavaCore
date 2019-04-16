package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static void getNumberInEnglish() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number (1 - 1 000 000): ");
        int n = scan.nextInt();

        List<String> numberNames = new ArrayList<>(10);
        numberNames.add(0, "");
        numberNames.add(1, "one");
        numberNames.add(2, "two");
        numberNames.add(3, "three");
        numberNames.add(4, "four");
        numberNames.add(5, "five");
        numberNames.add(6, "six");
        numberNames.add(7, "seven");
        numberNames.add(8, "eight");
        numberNames.add(9, "nine");

        List<String> numberNames2 = new ArrayList<>(10);
        numberNames2.add(0, "");
        numberNames2.add(1, "");
        numberNames2.add(2, "twenty");
        numberNames2.add(3, "thirty");
        numberNames2.add(4, "fourty");
        numberNames2.add(5, "fifty");
        numberNames2.add(6, "sixty");
        numberNames2.add(7, "seventy");
        numberNames2.add(8, "eighty");
        numberNames2.add(9, "ninety");

        List<String> numberNames3 = new ArrayList<>(10);
        numberNames3.add(0, "ten");
        numberNames3.add(1, "eleven");
        numberNames3.add(2, "twelwe");
        numberNames3.add(3, "thirteen");
        numberNames3.add(4, "fourteen");
        numberNames3.add(5, "fifteen");
        numberNames3.add(6, "sixteen");
        numberNames3.add(7, "seventeen");
        numberNames3.add(8, "eighteen");
        numberNames3.add(9, "nineteen");

        int myNumber = n;
        String s = "s";

        if (myNumber / 1000000 > 0) {
            System.out.print(numberNames.get(n / 1000000) + " million");
            myNumber = n % 1000000;
        }
        if ((myNumber / 1000 > 0)) {

            int partOfNumber = myNumber / 1000;
            if (partOfNumber / 100 > 0) {
                System.out.print(numberNames.get(partOfNumber / 100) + " hundred");
            }
            partOfNumber = partOfNumber % 100;

            if (partOfNumber / 10 > 1) {
                System.out.print(" " + numberNames2.get(partOfNumber / 10));

                partOfNumber = partOfNumber % 10;
            }

            if (partOfNumber / 10 > 0) {
                System.out.print(" " + numberNames3.get(partOfNumber % 10));
            }
            if (partOfNumber / 10 == 0) {
                System.out.print(" " + numberNames.get(partOfNumber % 10));
            }
        }
        if (myNumber / 1000 != 0) {
            System.out.print(" thousand");
        }
        myNumber = myNumber % 1000;

        if (myNumber / 100 != 0) {
            System.out.print(" " + numberNames.get(myNumber / 100) + " hundred");
        }
        myNumber = myNumber % 100;

        if (myNumber / 10 > 1) {
            System.out.print(" " + numberNames2.get(myNumber / 10));

            myNumber = myNumber % 10;
        }

        if (myNumber / 10 > 0) {
            System.out.println(" " + numberNames3.get(myNumber % 10));
        }
        if (myNumber / 10 == 0) {
            System.out.println(" " + numberNames.get(myNumber % 10));
        }
    }
}
