package ua.com.lozinska.additionalList1.task6;

import java.util.Scanner;

public class DifferentNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a1 = ");
        int a1 = scan.nextInt();
        System.out.println("Please enter a2 = ");
        int a2 = scan.nextInt();
        System.out.println("Please enter a3 = ");
        int a3 = scan.nextInt();
        System.out.println("Please enter a4 = ");
        int a4 = scan.nextInt();
        int n;
        if (a1 == a2) {
            if (a1 == a3) {
                n = a4;
            } else {
                n = a3;
            }
        } else if (a1 == a3) {
            n = a2;
        } else {
            n = a1;
        }
        System.out.println("Our numbers: " + a1 + " " + a2 + " " + a3 + " " + a4);
        System.out.println("Different number = " + n);
    }
}
