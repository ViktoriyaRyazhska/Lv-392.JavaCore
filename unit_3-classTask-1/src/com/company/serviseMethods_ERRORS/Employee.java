package com.company.serviseMethods_ERRORS;


public class Employee extends Person {

    private static Service service = new Service();
    private static Employee employee;

    private long numberID;
    private static Position positionRageOfHour;
    protected int hourOfMonth;

    private static double totalRate = 0;    // total salary all Employee

    // Constructors
    public Employee() {
        super();
    }

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, long numberID) {
        super(name);
        this.numberID = numberID;
    }

    public Employee(String name, long numberID/*, int rate*/, Position positionRageOfHour, int hourOfMonth) {
        super(name);
        this.numberID = numberID;
        this.positionRageOfHour = positionRageOfHour;
        this.hourOfMonth = hourOfMonth;
    }

    // getters and setters

    public long getNumberID() {
        return numberID;
    }

    public void setNumberID(long numberID) {
        this.numberID = numberID;
    }




    public int getHourOfMonth() {
        return hourOfMonth;
    }

    public void setHourOfMonth(int hourOfMonth) {
        this.hourOfMonth = hourOfMonth;
    }

    public static Position getPositionRageOfHour() {
        return positionRageOfHour;
    }

    public static void setPositionRageOfHour(Position positionRageOfHour) {
        Employee.positionRageOfHour = positionRageOfHour;
    }

    // Methods class
    public static void setTotalRate(double totalRate) {
        Employee.totalRate = totalRate;
//        totalRate += sumSalary();
    }


    @Override
    public String toString() {
        return String.format("Employee name: %1$s!\t\tID-%5$d\n\t\tyour salary: %2$,.3f$,\t" +
                "bonus: %3$,.3f$\n\t\tand your all salary with bonus = %4$,.3f$\n",
                getName(), service.calculateSalary(employee), service.changeRate(employee), service.sumSalary(employee), getNumberID());
    }

    /**
     * this method show info about Employee
     */
    public void show() {
        System.out.println(toString());
    }

    /**
     * this method calculate amount Employee
     */
    protected void totalCounter() {
        String s = String.format("Total employee: %d\n", counter.getCounter());
        System.out.print(s);
    }
}
