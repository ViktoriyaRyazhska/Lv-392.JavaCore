package ua.com.lozinska.lesson9.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dividing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a = ");
        try {
            double a = scan.nextDouble();
            System.out.println("Please enter b = ");

            double b = scan.nextDouble();
            div(a, b);

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    static void div(double a, double b) throws MyException {
        if (b == 0) {
            throw new MyException("Division by zero.");
        }

        double result = a / b;
        System.out.println("Result = " + result);
    }
}
