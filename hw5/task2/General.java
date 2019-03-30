package ua.edu.softserve.homework.hw5.task2;

public class General {

	public static void main(String[] args) {

		Employee[] employee = new Employee[4];

		employee[0] = new SalariedEmployee("John", "1", 100, 5, "SSN 1");
		employee[1] = new SalariedEmployee("Devid", "2", 200, 7, "SSN 2");
		employee[2] = new ContractEmployee("Ann", "3", 1000, "FTI 3");
		employee[3] = new ContractEmployee("Helen", "4", 2000, "FTI 4");

		bubleSortEmloyee(employee);

		for (Employee i : employee) {
			System.out.println(i + ", Average monthly wage = " + i.calculatePay());
		}
	}

	public static Employee[] bubleSortEmloyee(Employee arr[]) {
		Employee tmp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].calculatePay() < arr[j].calculatePay()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}

}
