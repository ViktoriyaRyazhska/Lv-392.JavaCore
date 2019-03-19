package com.company.serviseMethods_ERRORS;


public class Designer extends Employee {

    private Position positionRageOfHour;
    private static Service service;
    private Designer designer;

    public Designer() {
        super();
    }

    public Designer(String name) {
        super(name);
    }

    public Designer(String name, long employeeID) {
        super(name, employeeID);
    }

    public Designer(String name, long employeeID, Position positionRageOfHour, int hourOfMonth) {
        super(name, employeeID, positionRageOfHour, hourOfMonth);
    }


    @Override
    public String toString() {
        return String.format("Designer name: %1$s!\t\tID-%5$d\n\t\tyour salary: %2$,.3f$,\t" +
                "bonus: %3$,.3f$\n\t\tand your all salary with bonus = %4$,.3f$\n",
                getName(), service.calculateSalary(designer), service.changeRate(designer), service.sumSalary(designer), getNumberID());
//        return String.format("Designer name: %1$s!\t\tID-%5$d\n\t\tyour salary: %2$,.3f$,\tbonus: %3$,.3f$\n\t\tand your all salary with bonus = %4$,.3f$\n", super());   // Can  I call this  method use super????

    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    protected void totalCounter() {
        super.totalCounter();
    }
}
