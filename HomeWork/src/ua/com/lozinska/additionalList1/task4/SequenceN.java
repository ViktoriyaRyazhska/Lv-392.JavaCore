package ua.com.lozinska.additionalList1.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = scan.nextInt();

        List<Integer> realNumbers = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            new Scanner(System.in);
            System.out.println("Please enter the real number:");
            int r = scan.nextInt();
            realNumbers.add(i, r);
        }

        int sum = 0;
        System.out.println("Our sequense: ");
        for (int i = 0; i < n; i++) {
            sum = sum + realNumbers.get(i);
            System.out.print(sum + "  ");
        }

    }
}
