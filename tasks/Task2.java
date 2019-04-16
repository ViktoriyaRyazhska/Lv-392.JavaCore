package tasks;

import java.util.Scanner;

public class Task2 {

    public static void getProductOfPrimeNumbers(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scan.nextInt();

        System.out.println("Product of prime numbers:");
        for (int i = 2; i <= number; i++) {
            for (int j = 2; j <= number; j++) {
                if (number % j == 0) {
                    System.out.print(j + " ");
                    number = number / j;
                    break;
                }
            }

        }
        if (number != 1) {
            System.out.print(number);
        }
    }
}
