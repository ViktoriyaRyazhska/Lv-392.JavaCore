package com.company.enumRate;


public class Designer extends Employee {

    public Designer() {
        super();
    }

    public Designer(String name) {
        super(name);
    }

    public Designer(String name, long employeeID) {
        super(name, employeeID);
    }

    public Designer(String name, long employeeID, Position position, int hourOfMonth) {
        super(name, employeeID, position, hourOfMonth);
    }


    @Override
    public String toString() {
        return String.format("Designer name: %1$s!\t\tID-%5$d\n\t\tyour salary: %2$,.3f$,\t" +
                "bonus: %3$,.3f$\n\t\tand your all salary with bonus = %4$,.3f$\n",
                getName(), calculateSalary(), changeRate(), sumSalary(), getEmployeeID());
//        return String.format("Designer name: %1$s!\t\tID-%5$d\n\t\tyour salary: %2$,.3f$,\tbonus: %3$,.3f$\n\t\tand your all salary with bonus = %4$,.3f$\n", super());   // Can  I call this  method use super????

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
        super.totalCounter();
    }


    /**
     * this method shows total salary all instances this class
     * @param sums total salary
     */
    @Override
    public void showTotalSalary(double sums) {
        System.out.printf("Total salary designers: %,.3f$\n", sums);
    }
}
