package task4;

public class Car {

	private String type;
	private int year;
	private double engCap;
	
	public Car() {
	}

	public Car(String type, double engCap) {
		this.type = type;
		this.engCap = engCap;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Type=" + type + ", year=" + year + ", engCap=" + engCap;
	}
	  
	}
