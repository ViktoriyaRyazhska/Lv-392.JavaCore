package ua.com.lozinska.lesson4.floatNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input first number, please.");
        float num1 = Float.parseFloat(br.readLine());
        System.out.println("Input second number, please.");
        float num2 = Float.parseFloat(br.readLine());
        System.out.println("Input third number, please.");
        float num3 = Float.parseFloat(br.readLine());

        FloatNumber.checkNumber(num1, num2, num3);
    }

}
