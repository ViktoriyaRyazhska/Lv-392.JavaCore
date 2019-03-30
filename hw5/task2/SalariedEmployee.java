package ua.edu.softserve.homework.hw5.task2;

public class SalariedEmployee extends Employee implements CalculatePay {

	private double hourlyRate;
	private double numberOfHoursWorked;
	private String socialSecurityNumber;

	public SalariedEmployee(String name, String employeeId) {
		super(name, employeeId);
	}

	public SalariedEmployee(String name, String employeeId, double hourlyRate, double numberOfHoursWorked,
			String socialSecurityNumber) {
		super(name, employeeId);
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(double numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [hourlyRate=" + hourlyRate + ", numberOfHoursWorked=" + numberOfHoursWorked
				+ ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}

	@Override
	public double calculatePay() {
		return this.hourlyRate * this.numberOfHoursWorked;
	}

}
