package ua.com.lozinska.lesson6.employee;

public class FixedPaidWorker extends ContractEmployee {
    int fixedMonthlyPayment;

    public FixedPaidWorker(String name, String employeeId, int fixedMonthlyPayment) {
        this.name = name;
        this.employeeId = employeeId;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " ID: "
                + this.employeeId + " Salary: " + calculatePay();
    }
}
