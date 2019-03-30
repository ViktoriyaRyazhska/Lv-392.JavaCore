package ua.edu.softserve.homework.hw5.task2;

public class ContractEmployee extends Employee implements CalculatePay {

	private String federalTaxIdMember;
	private double fixedMonthlyPayment;

	public ContractEmployee(String name, String employeeId) {
		super(name, employeeId);
	}

	public ContractEmployee(String name, String employeeId, double fixedMonthlyPayment, String federalTaxIdMember) {
		super(name, employeeId);
		this.federalTaxIdMember = federalTaxIdMember;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	public String getFederalTaxIdMember() {
		return federalTaxIdMember;
	}

	public void setFederalTaxIdMember(String federalTaxIdMember) {
		this.federalTaxIdMember = federalTaxIdMember;
	}

	public double getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	@Override
	public double calculatePay() {

		return this.fixedMonthlyPayment;
	}

}
