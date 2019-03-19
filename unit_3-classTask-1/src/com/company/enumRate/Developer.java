package com.company.enumRate;


import java.util.List;

public class Developer extends Employee {


    // Constructors
    public Developer() {
    }

    public Developer(String name) {
        super(name);
    }

    public Developer(String name, long employeeID) {
        super(name, employeeID);
    }

    public Developer(String name, long employeeID, Position position, int hourOfMonth) {
        super(name, employeeID, position, hourOfMonth);
    }



    @Override
    public String toString() {
        return String.format("Developer name: %1$s!\t\tID-%5$d\n\t\tyour salary: %2$,.3f$,\t" +
                "bonus: %3$,.3f$\n\t\tand your all salary with bonus = %4$,.3f$\n",
                getName(), calculateSalary(), changeRate(), sumSalary(), getEmployeeID());
    }

    /**
     * this method show info about instance this class
     */
    @Override
    public void show() {
        super.show();
    }

    @Override
    protected void totalCounter() {
        String s = String.format("Total developer: %d\n", counter.getCounter());
        System.out.print(s);
    }

/*//    @Override
    public double totalSalary(List<Developer> developers){
        double totalSalary = 0;
        for(int i = 0; i < developers.size(); i++) {
            totalSalary += developers.get(i).sumSalary();
            System.out.printf("%,.3f + ", developers.get(i).sumSalary());
        }
        System.out.println();
        return totalSalary;
    }*/

    /**
     * this method shows total salary all instances this class
     * @param sums total salary
     */
    @Override
    public void showTotalSalary(double sums) {
        System.out.printf("Total salary developers: %,.3f$\n", sums);
    }

}
