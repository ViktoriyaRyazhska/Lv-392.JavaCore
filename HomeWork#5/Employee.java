package myPack;
abstract interface CalcPay{
	public void calculatePay();
}
public abstract class Employee implements CalcPay {
	private String employeeld;
	private String name;
	private int salary;
	public Employee(String employeeld, String name) {
		this.employeeld = employeeld;
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmployeeld() {
		return employeeld;
	}
	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "ID - " + employeeld + " - "+ name + " - salary = " + salary;
	}
}
class ContractEmployee extends Employee implements CalcPay{
	private int federalTaxIdmember;
	int fixedMonthlyPayment;
	public ContractEmployee(String employeeld, String name, int fixedMonthlyPayment) {
		super(employeeld, name);
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}
	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}
	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}
	public int getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}
	public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	} 
	public void calculatePay() {
		setSalary(getFixedMonthlyPayment());
	}
}
class SalariedEmployee extends Employee implements CalcPay{
	private String socialSecurityNumber;
	private int hourlyRate;
	private int workHours;
	public int getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public int getWorkHours() {
		return workHours;
	}
	public void setWorkHours(int WorkHours) {
		this.workHours = WorkHours;
	}
	public SalariedEmployee(String employeeld, String name, int workHours, int hourlyRate) {
		super(employeeld, name);
		this.hourlyRate = hourlyRate;
		this.workHours = workHours;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public void calculatePay() {
		setSalary(getHourlyRate() * getWorkHours());	
	}
}