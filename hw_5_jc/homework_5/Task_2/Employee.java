package homework_5.Task_2;

public abstract class Employee implements Pay{

    public String name;
    public String employeeld;

    public Employee(String name, String employeeld) {
        this.name = name;
        this.employeeld = employeeld;
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

    public abstract double calculatePay();

    @Override
    public String toString() {
        return "ID = " + employeeld + ", Name = " + name;
    }
}
