package TASK2;

public class Main {

	public static void main(String[] args) {
		Employee emp [] = new Employee[7];
		emp[0] = new SalariedEmployee("777","Vasil", 136 , 58);
		emp[1] = new SalariedEmployee("559","Meha", 186 , 57);
		emp[2] = new SalariedEmployee("6661","Mike", 147 , 60);
		emp[3] = new ContractEmployee("879","Katya", 6800);
		emp[4] = new SalariedEmployee("987","Nastya", 139, 78);
		emp[5] = new ContractEmployee("7983","Max", 6800);
		emp[6] = new ContractEmployee("9887","Ross", 13000);
		
		for(int i = 0; i<emp.length; i++) {
			if(emp[i] instanceof SalariedEmployee) {
				((SalariedEmployee)emp[i]).calculatePay();
			}
			else if(emp[i] instanceof ContractEmployee) {
				((ContractEmployee)emp[i]).calculatePay();
			}
		}
		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].getSalary() > emp[j].getSalary()) {
					Employee Variable = emp[i];
					emp[i] = emp[j];
					emp[j] = Variable;
				}
			}
			System.out.println(emp[i]);
	}
}
}
