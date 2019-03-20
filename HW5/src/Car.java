import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Car {
	private String type;
	private int year_production;
	private double engine_capacity;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear_production() {
		return year_production;
	}
	public void setYear_production(int year_production) {
		this.year_production = year_production;
	}
	public double getEngine_capacity() {
		return engine_capacity;
	}
	public void setEngine_capacity(int engine_capacity) {
		this.engine_capacity = engine_capacity;
	}
	public Car(String type, int year_production, double engine_capacity) {
		this.type = type;
		this.year_production = year_production;
		this.engine_capacity = engine_capacity;
	}
	
	@Override
	public String toString() {
		return "Car type= " + type + ", year_production= " + year_production 
				+ ", engine_capacity= " + engine_capacity;
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[]args) throws NumberFormatException, IOException {
		
		
		Car car [] = new Car[4];
		car [0] = new Car("Sedan", 1998, 2.0);
		car [1] = new Car("Cabriolet", 2008, 3.5);
		car [2] = new Car("Coupe", 2009, 2.5);
		car [3] = new Car("Truck", 2019, 1.8);
		
		System.out.println("Please, enter a car year: ");
		int carYear = Integer.parseInt(br.readLine());
		for (int i = 0; i < car.length; i++) {
		if(carYear == car[i].getYear_production()) {
			System.out.println(car[i].getType());
			System.out.println();
		}	
		}
		Car Value;
		for (int i = 0; i < car.length - 1; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].getYear_production() > car[j].getYear_production()) {
					Value = car[i];
					car[i] = car[j];
					car[j] = Value;
				}
			}
		}
			System.out.println(Arrays.toString(car));
	}
	
	
	

}
