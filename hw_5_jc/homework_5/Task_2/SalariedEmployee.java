package homework_5.Task_2;

public class SalariedEmployee extends Employee implements Pay {

    private double hourlyRate;
    private double numberOfHoursWorked;

    private String socialSecurityNumber;

    public SalariedEmployee(String name, String employeeld) {
        super(name, employeeld);
    }

    public SalariedEmployee(String employeeld, String name, double hourlyRate, double numberOfHoursWorked,
                                                                              String socialSecurityNumber) {
        super(name,employeeld);
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double calculatePay(){
        return this.hourlyRate * this.numberOfHoursWorked;
    }
}
