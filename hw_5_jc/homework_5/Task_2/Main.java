package homework_5.Task_2;

public class Main {

    public static void main(String[] args) {

        Employee [] employees = new Employee[4];

        employees[0] = new SalariedEmployee("001", "Jack", 100, 5,
                "SSN 1");
        employees[1] = new SalariedEmployee("002", "Rory", 200, 7,
                "SSN 2");
        employees[2] = new ContractEmployee("003", "Bill", 1000,
                "FTI 003");
        employees[3] = new ContractEmployee("004", "Ann", 2000,
                "FTI 004");

        bubleSortEmloyee(employees);

        for (Employee i : employees){
            System.out.println(i + ", Average monthly wage = " + i.calculatePay());
        }
    }

    public static Employee[] bubleSortEmloyee(Employee arr[]){
        Employee tmp;
        for (int i = 0; i < arr.length - 1; i++) {
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
