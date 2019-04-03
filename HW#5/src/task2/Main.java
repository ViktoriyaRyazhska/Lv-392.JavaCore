package task2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Employee[] arrEm = new Employee[5];

		arrEm[0] = new ContractEmployee("ID#11", "Taras", 1000, 300, 8);
		arrEm[1] = new ContractEmployee("ID#12", "Vasya", 2000, 200, 8);
		arrEm[2] = new ContractEmployee("ID#13", "Peter", 3000, 100, 8);
		arrEm[3] = new SalariedEmployee("ID#21", "Andry", 1408988, 4500);
		arrEm[4] = new SalariedEmployee("ID#22", "Misha", 2308989, 950);

		for (int i = 0; i < arrEm.length; i++) {
			if (arrEm[i] instanceof ContractEmployee) {
				((ContractEmployee) arrEm[i]).calculatePay();
			} else if (arrEm[i] instanceof SalariedEmployee) {
				((SalariedEmployee) arrEm[i]).calculatePay();
			}
		}

		for (int i = 0; i < arrEm.length; i++) {
			for (int j = i + 1; j < arrEm.length; j++) {
				if (arrEm[i].getAverageMonthlyWage() > arrEm[j].getAverageMonthlyWage()) {
					Employee tmp = arrEm[j];
					arrEm[j] = arrEm[i];
					arrEm[i] = tmp;
				}
			}

		}
		Arrays.stream(arrEm).forEach(System.out::println);
	}

}
