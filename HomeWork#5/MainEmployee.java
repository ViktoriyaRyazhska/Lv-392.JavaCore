package myPack;
class MainEmployee {
	public static void main(String[] args) {
		Employee emp [] = new Employee[4];
		emp[0] = new SalariedEmployee("1","Yulia", 30 , 30);
		emp[1] = new ContractEmployee("2","Masha", 300);
		emp[2] = new SalariedEmployee("3","Vika", 31 , 65);
		emp[3] = new ContractEmployee("4","Roma", 700);
		for(int i = 0; i<emp.length; i++) {
			emp[i].calculatePay();
			}
		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].getSalary() > emp[j].getSalary()) {
					Employee e = emp[i];
					emp[i] = emp[j];
					emp[j] = e;
				}
			}
			System.out.println(emp[i]);
	}
}
}