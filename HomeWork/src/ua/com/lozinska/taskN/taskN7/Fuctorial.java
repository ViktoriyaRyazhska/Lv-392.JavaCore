package ua.com.lozinska.taskN.taskN7;

import java.util.Scanner;

public class Fuctorial {
    public static void getFuctorial() {
        System.out.println("7. Input number n and calculate n! (e.g. 5! = 1*2*3*4*5 = 120)");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n = scan.nextInt();

        int result = 1;
        int i = 1;
        while (i < n) {
            result = result * i;
            System.out.print(i + " * ");
            i++;
        }
        System.out.println(i);
        System.out.println();
        System.out.println("n! = " + result*i);
    }
}
