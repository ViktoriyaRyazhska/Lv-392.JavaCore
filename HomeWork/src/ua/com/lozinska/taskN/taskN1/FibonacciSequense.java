package ua.com.lozinska.taskN.taskN1;

import java.util.Scanner;

public class FibonacciSequense {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = scan.nextInt();

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
    }
}
