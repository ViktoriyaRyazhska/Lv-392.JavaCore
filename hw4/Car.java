package ua.edu.softserve.homework.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Car {

	private String type;
	private int year;
	private double engineCapacity;

	public Car() {
	}

	public Car(String type, int year, double engineCapacity) {
		super();
		this.type = type;
		this.year = year;
		this.engineCapacity = engineCapacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "Car [type: " + type + ", year: " + year + ", engineCapacity: " + engineCapacity + "]";
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Car[] car = new Car[5];
		car[0] = new Car("Sedan", 2011, 3.5);
		car[1] = new Car("Universal", 2009, 1.6);
		car[2] = new Car("Coupe", 2011, 2.5);
		car[3] = new Car("OutRoad", 2007, 3.0);
		car[4] = new Car("Bus", 2010, 2.2);

		System.out.println("Enter year of car ...");
		int carYear = Integer.parseInt(br.readLine());
		for (int i = 0; i < car.length; i++) {
			if (carYear == car[i].getYear()) {
				System.out.println(car[i].getType() + "\n");

			}

		}
	}

}
