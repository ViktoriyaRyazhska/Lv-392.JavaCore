package myPack;
import java.io.*;
import java.util.Arrays;
public class Car {
    String type;
    int yearOfProduction;
    double engineCapacity;
	public Car(String type, int yearOfProduction, double engineCapacity) {
		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getyearOfProduction() {
		return yearOfProduction;
	}
	public void setyearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	public double getengineCapacity() {
		return engineCapacity;
	}
	public void setengineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public String toString() {
		return "\nType - " + type + ", yearOfProduction - " + yearOfProduction 
				+ ", engineCapacity - " + engineCapacity;
	}
	public static void main(String[]args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Car c [] = new Car[4];
		c [0] = new Car("Hatchback ", 2001, 2.0);
		c [1] = new Car("Minivan", 2011, 1.8);
		c [2] = new Car("Crossover", 2017, 3.0);
		c [3] = new Car("Sedan", 2010, 1.6);
		System.out.println("Enter year : ");
		int year = Integer.parseInt(br.readLine());
		for (int i = 0; i < c.length; i++) {
		if(year == c[i].getyearOfProduction()) {
			System.out.println(c[i].getType());
			System.out.println();
		}	
		}
		Car r;
		for (int i = 0; i < c.length - 1; i++) {
			for (int a = i + 1; a < c.length; a++) {
				if (c[i].getyearOfProduction() > c[a].getyearOfProduction()) {
					r = c[i];
					c[i] = c[a];
					c[a] = r;
				}
			}
		}
			System.out.println(Arrays.toString(c));
	}
}