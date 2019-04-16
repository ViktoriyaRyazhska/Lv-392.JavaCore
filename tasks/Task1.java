package tasks;

import java.util.Scanner;

public class Task1 {

    public static void getFibonacciSequense() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = scan.nextInt();

        if (n > 0) {
            System.out.println("Fibonacci numbers including " + n + " place:");
            int prevFibonacciNumber = 0;
            int thisFibonacciNumber = 1;
            int nextFibonacciNumber;
            System.out.print(thisFibonacciNumber + " ");
            for (int i = 1; i < n; i++) {
                nextFibonacciNumber = prevFibonacciNumber + thisFibonacciNumber;
                prevFibonacciNumber = thisFibonacciNumber;
                thisFibonacciNumber = nextFibonacciNumber;
                System.out.print(nextFibonacciNumber + " ");
            }
        }else{
            System.out.println("Number is not positiv.");
        }
    }
}
