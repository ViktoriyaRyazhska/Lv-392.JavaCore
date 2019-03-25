package ua.com.lozinska.lesson6.employee;

public class RunProject {

    public static void main(String[] args) {
        Employee[] myEmployee = new Employee[5];
        myEmployee[0] = new HourlyPaidWorker("Petro", "321123", 200, 32);
        myEmployee[1] = new FixedPaidWorker("Ludmila", "254123", 5622);
        myEmployee[2] = new FixedPaidWorker("Pit", "369852", 2699);
        myEmployee[3] = new HourlyPaidWorker("Vasil", "365896", 300, 36);
        myEmployee[4] = new HourlyPaidWorker("Maria", "587496", 305, 35);


        Employee tmp = null;
        for (int i = 0; i < myEmployee.length - 1; i++) {
            for (int j = i + 1; j < myEmployee.length; j++) {
                if (myEmployee[i].calculatePay() < myEmployee[j].calculatePay()) {
                    tmp = myEmployee[i];
                    myEmployee[i] = myEmployee[j];
                    myEmployee[j] = tmp;
                }
            }
        }
        for (int i = 0; i < myEmployee.length; i++) {
            System.out.println(myEmployee[i]);

        }
    }

}