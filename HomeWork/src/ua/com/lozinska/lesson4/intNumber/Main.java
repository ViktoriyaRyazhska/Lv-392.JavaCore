package ua.com.lozinska.lesson4.intNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input first number, please.");
        int num1 = Integer.parseInt(br.readLine());
        System.out.println("Input second number, please.");
        int num2 = Integer.parseInt(br.readLine());
        System.out.println("Input third number, please.");
        int num3 = Integer.parseInt(br.readLine());

        Main.maxNumber(num1, num2, num3);
        Main.minNumber(num1, num2, num3);
    }

    public static int maxNumber(int num1, int num2, int num3) {
        if ((num1 >= num2) && (num1 >= num3)) {
            System.out.println("Maximum number is " + num1);
            return num1;
        } else if ((num2 >= num1) && (num2 >= num3)) {
            System.out.println("Maximum number is " + num2);
            return num2;
        } else System.out.println("Maximum number is " + num3);
        return num3;
    }

    public static int minNumber(int num1, int num2, int num3) {
        if ((num1 <= num2) && (num1 <= num3)) {
            System.out.println("Minimum number is " + num1);
            return num1;
        } else if ((num2 <= num1) && (num2 <= num3)) {
            System.out.println("Minimum number is " + num2);
            return num2;
        } else System.out.println("Minimum number is " + num3);
        return num3;
    }
}
