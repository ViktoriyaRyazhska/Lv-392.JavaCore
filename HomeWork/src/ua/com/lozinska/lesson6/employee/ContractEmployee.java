package ua.com.lozinska.lesson6.employee;

public class ContractEmployee extends Employee implements Payment {
    int federalTaxldmember;

    @Override
    public int calculatePay() {
        return 100;
    }
}
