package ua.com.lozinska.lesson6.employee;

public class SalariedEmployee extends Employee implements Payment {
    String socialSecurityNumber;

    @Override
    public int calculatePay() {
        return 200;
    }
}
