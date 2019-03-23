package homework_5.Task_2;

public class ContractEmployee extends Employee implements Pay{

    private double fixedMonthlyPayment;
    private String federalTaxIdmember;

    public ContractEmployee(String name, String employeeld) {
        super(name, employeeld);
    }

    public ContractEmployee(String employeeld, String name, double fixedMonthlyPayment, String federalTaxIdmember) {
        super(name, employeeld);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public double calculatePay(){
        return this.fixedMonthlyPayment;
    }
}
