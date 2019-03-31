package task2;

public class ContractEmployee extends Employee implements ICalculatePay{
	
	private int federalTaxIdmember;
	private int hoursWorked;
	private int hourlyRate;
	
	
	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}


	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}


	public int getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}


	public int getHourlyRate() {
		return hourlyRate;
	}


	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	
	public ContractEmployee(String employeeId, String name, int federalTaxIdmember,
			int hoursWorked, int hourlyRate) {
		super(employeeId, name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}


	@Override
	public int calculatePay() {
		averageMonthlyWage = hoursWorked*hourlyRate;
		return averageMonthlyWage;
	}


	@Override
	public String toString() {
		return String.format("\t%25s \t%25s \t%25s \t%25s", "[Contract Employee: employeeId = " + getEmployeeId(), " | Name = " + getName(), " | Federal Tax Id Member = " + federalTaxIdmember, " | Average wonthly wage = " + calculatePay()+"]");
	}
	
	
}
