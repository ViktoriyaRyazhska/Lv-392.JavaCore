package ua.com.lozinska.additionalList1.task5;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a = ");
        int a = scan.nextInt();
        System.out.println("Please enter b = ");
        int b = scan.nextInt();
        System.out.println("Please enter c = ");
        int c = scan.nextInt();

        System.out.print("Our triangle is: ");
        if (a == b && b == c) {
            System.out.println("3");
        } else if (((a == b) && (a + b) > c) || ((b == c) && (b + c) > a) || ((a == c) && (a + c) > b)) {
            System.out.println("2");
        } else if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("1");
        } else
            System.out.println("0");
    }
}
