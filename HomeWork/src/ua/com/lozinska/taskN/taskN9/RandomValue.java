package ua.com.lozinska.taskN.taskN9;

import java.util.Random;
import java.util.Scanner;

public class RandomValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n = scan.nextInt();

        int sum1 = 0;

        for (int i = 0; i < n; i++) {

            Random random = new Random();
            int number = random.nextInt(2);
            System.out.print(number + " ");
            if (number == 1) {
                sum1 = sum1 + 1;
            }
        }
        System.out.println();
        System.out.println("Number of 1 = " + sum1);
    }
}
