package ua.com.lozinska.lesson9.task2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        List<Integer> myNumbers = new ArrayList<>(10);

        try {
            int a = readNumber(1, 100);
            myNumbers.add(0, a);
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Wrong number format!");
        }


        for (int i = 1; i < 10; i++) {

            int a = readNumber(1, 100);

            try {
                if (a > myNumbers.get(i - 1)) {
                    myNumbers.add(a);
                } else {
                    System.out.println("Next number should be greater than previous!");
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Wrong number format!");
            }
        }
        System.out.println(myNumbers + " ");
    }

    public static int readNumber(int start, int end) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number = ");
        try {
            int a = scan.nextInt();
            if (a >= start && a <= end) {
                return a;
            } else {
                System.err.println("This number is not in the range.");
                return -1;
            }

        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Wrong number format!");
            return -1;
        }
    }
}





