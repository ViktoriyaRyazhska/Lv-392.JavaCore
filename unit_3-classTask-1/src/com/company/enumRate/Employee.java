package com.company.enumRate;


import java.util.List;

public class Employee extends Person {

    private long employeeID;
    private Position position;
    protected int hourOfMonth;

    private static double totalRate = 0;    // total salary all Employee

    // Constructors
    public Employee() {
        super();
    }

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, long employeeID) {
        super(name);
        this.employeeID = employeeID;
    }

    public Employee(String name, long employeeID/*, int rate*/, Position position, int hourOfMonth) {
        super(name);
        this.employeeID = employeeID;
        this.position = position;
        this.hourOfMonth = hourOfMonth;

    }

    // getters and setters

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }




    public int getHourOfMonth() {
        return hourOfMonth;
    }

    public void setHourOfMonth(int hourOfMonth) {
        this.hourOfMonth = hourOfMonth;
    }

    public Position getPosition() {
        return  position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    // Methods class
    public static void setTotalRate(double totalRate) {
        Employee.totalRate = totalRate;
//        totalRate += sumSalary();
    }


    /**
     * this method calculate salary of month instance this class
     * @return
     */
    public double calculateSalary() {
        double salary = position.getRageOfHour() * getHourOfMonth();
        return salary;
    }

    /**
     * this method calculate rate(bonus) to salary instance this class
     * @return
     */
    public double changeRate(){
            double changeBonus = 0;
        if(getHourOfMonth() > 150) {
            changeBonus = calculateSalary() * 0.1;
//            newRate += changeBonus;
        } else if(getHourOfMonth() > 200) {
            changeBonus = calculateSalary() * 0.2;
//            newRate += changeBonus;
        } else{
//            newRate += changeBonus;
        }
//        return newRate;
        return changeBonus;
    }

    /**
     * this method calculate salary  + rate(bonus) instance this class
     * @return
     */
    public double sumSalary() {
        double sumSalary = calculateSalary() + changeRate();
        return  sumSalary;
    }

    @Override
    public String toString() {
        return String.format("Employee name: %1$s!\t\tID-%5$d\n\t\tyour salary: %2$,.3f$,\t" +
                "bonus: %3$,.3f$\n\t\tand your all salary with bonus = %4$,.3f$\n",
                getName(), calculateSalary(), changeRate(), sumSalary(), getEmployeeID());
    }

    /**
     * this method show info about instance this class
     */
    public void show() {
        System.out.println(toString());
    }

    /**
     * this method calculate amount all instances this class
     */
    protected void totalCounter() {
        String s = String.format("Total employee: %d\n", counter.getCounter());
        System.out.print(s);
    }

    /**
     * this method calculate total salary all instances this class
     * @param employees collection List
     * @return
     */
    public double totalSalary(List<Employee> employees){
         double totalSalary = 0;
         for(int i = 0; i < employees.size(); i++) {
             totalSalary += employees.get(i).sumSalary();
             System.out.printf("%,.3f + ", employees.get(i).sumSalary());
         }
        System.out.println();
        return totalSalary;
    }

    /**
     * this method shows total salary all instances this class
     * @param sums total salary
     */
    public void showTotalSalary(double sums) {
        System.out.printf("Total salary employee: %,.3f$\n", sums);
    }
}
