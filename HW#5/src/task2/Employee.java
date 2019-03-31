package task2;

public class Employee {
	
	private String employeeId;
	private String name;
	protected int averageMonthlyWage;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAverageMonthlyWage() {
		return averageMonthlyWage;
	}
	public void setAverageMonthlyWage(int averageMonthlyWage) {
		this.averageMonthlyWage = averageMonthlyWage;
	}
	
	public Employee(String employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

}
