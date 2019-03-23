package TASK2;

public  class SalariedEmployee extends Employee implements Interface{
	
	private String socialSecurityNumber;
	private int hourly_rate;
	private int numberOfhoursWorked;
	
	public int getHourly_rate() {
		return hourly_rate;
	}
	public void setHourly_rate(int hourly_rate) {
		this.hourly_rate = hourly_rate;
	}
	public int getNumberOfhoursWorked() {
		return numberOfhoursWorked;
	}
	public void setNumberOfhoursWorked(int numberOfhoursWorked) {
		this.numberOfhoursWorked = numberOfhoursWorked;
	}
	
	public SalariedEmployee(String employeeld, String name, int hourly_rate, int numberOfhoursWorked) {
		super(employeeld, name);
		this.hourly_rate = hourly_rate;
		this.numberOfhoursWorked = numberOfhoursWorked;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	@Override
	public void calculatePay() {
		setSalary(getNumberOfhoursWorked() * getHourly_rate());
		
	}

}
