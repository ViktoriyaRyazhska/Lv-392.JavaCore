package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowerBed {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int radius;
		double perim;
		double area;
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)); 
		System.out.println("Put radius of circle in meters : ");
		radius = Integer.parseInt(br.readLine());
		perim = 2*Math.PI*radius;
		area = Math.PI*(radius*radius);
		System.out.println("Radius of cirqle = " +radius +" m");
		System.out.printf("Perimeter of cirqle = %.2f", perim);
		System.out.println(" m");
		System.out.printf("Area of cirqle = %.2f", area);
		System.out.println(" m");
	}

}