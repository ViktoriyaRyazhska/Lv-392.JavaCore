package com.company.serviseMethods_ERRORS;


public class Developer extends Employee {

    private static Service service;
    private Developer developer;

    // Constructors
    public Developer() {
        super();
    }

    public Developer(String name) {
        super(name);
    }

    public Developer(String name, long employeeID) {
        super(name, employeeID);
    }

    public Developer(String name, long employeeID, Position positionRageOfHour, int hourOfMonth) {
        super(name, employeeID, positionRageOfHour, hourOfMonth);
    }



    @Override
    public String toString() {
        return String.format("Developer name: %1$s!\t\tID-%5$d\n\t\tyour salary: %2$,.3f$,\t" +
                "bonus: %3$,.3f$\n\t\tand your all salary with bonus = %4$,.3f$\n",
                getName(), service.calculateSalary(developer), service.changeRate(developer), service.sumSalary(developer), getNumberID());
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    protected void totalCounter() {
        String s = String.format("Total developer: %d\n", counter.getCounter());
        System.out.print(s);
    }
}
