package ua.com.lozinska.additionalList1.task7;

import java.util.Scanner;

public class IdentifyPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter integer number k = (1..180): ");
        int k = scan.nextInt();

        int identifyPosition;

        if (k % 2 != 0) {
            if (k < 20) {
                identifyPosition = k / 10;
            } else {
                identifyPosition = k / 20 + 1;
            }
        } else {
            identifyPosition = (k % 20) / 2 - 1;
            if (identifyPosition == -1) {
                identifyPosition = 9;
            }
        }
        System.out.println("Sequence of numbers: 10111213141516171819202122......979899");
        System.out.println("Digit on " + k + " position = " + identifyPosition);
    }
}
