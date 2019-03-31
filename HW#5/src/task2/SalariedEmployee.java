package task2;

public class SalariedEmployee extends Employee implements ICalculatePay {
	
	private int socialSecurityNumber;
	private int fixedPayment;
	
	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public int getFixedPayment() {
		return fixedPayment;
	}
	public void setFixedPayment(int fixedPayment) {
		this.fixedPayment = fixedPayment;
	}
	
	public SalariedEmployee(String employeeId, String name, int socialSecurityNumber,
			int fixedPayment) {
		super(employeeId, name);
		this.socialSecurityNumber = socialSecurityNumber;
		this.fixedPayment = fixedPayment;
	}
	
	@Override
	public int calculatePay() {
		averageMonthlyWage = fixedPayment;
		return averageMonthlyWage;
	}


	@Override
	public String toString() {
		return String.format("\t%25s \t%25s \t%25s \t%25s", "[SalariedEmployee: employeeId = " + getEmployeeId(), " | Name = "+getName(), " | Social Security Number = " + socialSecurityNumber , " | Average wonthly wage = " + calculatePay()+"]");
	}
	
	
}
