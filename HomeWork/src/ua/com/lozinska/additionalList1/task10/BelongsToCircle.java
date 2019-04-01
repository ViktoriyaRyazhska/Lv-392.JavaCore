package ua.com.lozinska.additionalList1.task10;

import java.util.ArrayList;
import java.util.Scanner;

public class BelongsToCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter integer number n, (n>=2): ");
        int n = scan.nextInt();
        System.out.println("Please enter the radius r = ");
        int r = scan.nextInt();

        ArrayList<Integer> myCoordinates = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter real number a(" + (i + 1) + ") = ");
            int a = scan.nextInt();
            myCoordinates.add(i, a);
        }
        System.out.println("This coordinates belongs to the circle with radius " + r + ":");
        int i = 0;
        int j = n - 1;
        while ((i < n) && (j >= 0)) {
            if ((myCoordinates.get(i) <= r) && (myCoordinates.get(j)) <= r) {
                System.out.print("(" + myCoordinates.get(i) + "; " + myCoordinates.get(j) + ")  ");
                i++;
                j--;
            } else {
                i++;
                j--;
            }
        }
        System.out.println();
    }
}
