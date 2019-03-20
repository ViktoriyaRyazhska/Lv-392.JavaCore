package ua.com.lozinska.lesson5.sumAndProduct;

import java.util.Scanner;

public class SumProduct {
    static int sum = 0;
    static int prod = 1;
    static int numbers[] = new int[10];

    public static void main(String[] args) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number");
            Scanner input = new Scanner(System.in);
            numbers[i] = input.nextInt();
        }
        SumProduct.checkNumbers();

    }

    static void checkNumbers() {
        boolean isPositive = true;
        for (int i = 0; i < 5; i++) {
            if ((numbers[i] > 0) && isPositive) {
                sum += numbers[i];
            } else {
                isPositive = false;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println();

        if (isPositive) {
            System.out.println("Sum = " + sum);
        } else {
            for (int n = numbers.length - 6; n < numbers.length; n++) {
                prod = prod * numbers[n];
            }
            System.out.println("Product = " + prod);
        }

    }
}