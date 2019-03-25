package ua.com.lozinska.lesson6.employee;

public class HourlyPaidWorker extends SalariedEmployee {
    private int hourlyRate;
    private int numberOfHours;

    public HourlyPaidWorker(String name, String employeeId, int hourlyRate, int numberOfHours) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;


    }

    @Override
    public int calculatePay() {
        return hourlyRate * numberOfHours;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " ID: "
                + this.employeeId + " Salary: " + calculatePay();
    }
}
