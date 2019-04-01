package ua.com.lozinska.additionalList1.task8;

import java.util.Scanner;

public class NSD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter integer number a = ");
        int a = scan.nextInt();
        System.out.println("Please enter integer number b = ");
        int b = scan.nextInt();

        int c = 1;
        int greaterNumber;

        if (a > b) {
            greaterNumber = a;
        } else {
            greaterNumber = b;
        }

        for (int i = 2; i < greaterNumber; i++) {
            if (a % i == 0) {
                if (b % i == 0) {
                    c = i;
                }
            }
        }
        System.out.println("Naibilshyi spilnyi dilnyk chisel " + a + " i " + b + " = " + c);
    }
}
