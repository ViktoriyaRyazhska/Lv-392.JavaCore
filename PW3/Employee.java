
public class Employee {
	private String name;
	private int rate;
	private int hours;

	public static double totalSum = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum += (this.rate * this.hours) + bonus();

	}

	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
		totalSum += this.rate * this.hours;

	}

	public int salary() {
		return rate * hours;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + " salary: " + salary() + " bonus: "
				+ bonus() + "]";
	}

	public void changeRate(int rate) {
		if (rate != 0) {
			this.setRate(rate);
		}
	}

	public double bonus() {
		if (salary() > 1500) {
			return salary() * 0.1;
		}
		return 0;

	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("Vasya", 28, 45);
		Employee emp2 = new Employee("Petya", 45, 78);
		Employee emp3 = new Employee("Katya", 15, 123);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println("____________________");

		System.out.println(totalSum);

	}

}
