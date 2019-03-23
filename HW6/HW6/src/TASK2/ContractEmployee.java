package TASK2;

public   class ContractEmployee extends Employee implements Interface{

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
	
	@Override
	public void calculatePay() {
		setSalary(getFixedMonthlyPayment());
	}


}
