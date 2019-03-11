package ua.com.lozinska.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FlowerBed {
    public static void main (String[] args) throws IOException {
        System.out.println("Enter the radius please:)");
        System.out.println("r = ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r = Double.parseDouble(br.readLine());

        System.out.println("Perimeter of the Flower bed is equal to " + 2*3.14*r);
        System.out.println("Area of the Flower bed is equal to " + 3.14*r*r);
    }

}
