package com.company.enumRate;

//import Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Exercise:
 * Create Console Application project in Java.
 * Add class Employee to the project.
 * Class Employee should consists of
 *  - three private fields: name, rate and hours;
 *  - static field totalSum
 *  - properties for access to these fields;
 *  - default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
 *  - methods:
 *
 * 	1. salary - to calculate the salary of person (rate * hours)
 * 	2. toString - to output information about employee
 * 	3. changeRate - to change the rate of employee
 * 	4. bonuses – to calculate 10% from salary
 *
 * In the method main() create 3 objects of Employee type. Input information about them.
 * Display the total salary of all workers to screen
 *
 */


/**
 * in this version project I use class enum Position for calculate salary Employee
 */
public class Main {

    private static Employee emp = new Employee();
    private static Developer dev = new Developer();
    private static Designer des = new Designer();

    public static void main(String[] args) {


/*
        Employee emp1 = new Employee("Volodimir", 1245569, 5, 210);
        Employee emp2 = new Employee("Oleh", 1240069, 11, 150);

//        emp1.
//        employeeService.

        Service sv = new Service();
        emp1.show();

        emp2.show();
//        System.out.println(Employee.setTotalRate(););
//        employee.totalCounter();
*/


//        Employee.setTotalRate();

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Ivan", 1246662, Position.INTERMIDIATE_PRO, 220));
        employees.add(new Employee("Petro", 1246663, Position.JUNIOR_STRONG, 110));
        employees.add(new Employee("Karl", 1246664, Position.JUNIOR, 30));
        employees.add(new Employee("Lola", 1246665, Position.JUNIOR_PRO, 142));
        employees.add(new Employee("Bendhamin", 1246666, Position.INTERMIDIATE, 167));
        employees.add(new Employee("Bob", 1246667, Position.INTERMIDIATE_STRONG, 218));
        employees.add(new Employee("Olha", 1246668, Position.SENIOR, 219));
        employees.add(new Employee("Katerina", 1246679, Position.JUNIOR, 231));
        employees.add(new Employee("Viktoria", 1246649, Position.JUNIOR, 195));
        employees.add(new Employee("Marharita", 1246659, Position.JUNIOR_PRO, 64));
        Collections.shuffle(employees);
        for(Employee emp : employees) {
            emp.show();
        }
        emp.showTotalSalary(emp.totalSalary(employees));



        System.out.println("!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!");

        for(int i = 0; i < employees.size(); i++) {
            String name = employees.get(i).getName();
            System.out.println(name);
        }

        System.out.println("=====================");
        System.out.println("=====================");
        System.out.println("=====================");

/*
        Collection<String> names;
//        Collection<String> names1 = Collections.singleton(employees.get(i).getName());

        for(int i = 0; i < employees.size(); i++) {
            names = Collections.singleton(employees.get(i).getName());
//            String name = employees.get(i).getName();
        }


*/
        List<Developer> developers = new ArrayList<Developer>();
        developers.add(new Developer("Ivan1", 1246662, Position.INTERMIDIATE_STRONG, 220));
        developers.add(new Developer("Ivan2", 1246663, Position.INTERMIDIATE_STRONG, 120));
        developers.add(new Developer("Ivan3", 1246664, Position.INTERMIDIATE_STRONG, 150));
        developers.add(new Developer("Ivan4", 1246665, Position.INTERMIDIATE_STRONG, 120));
        developers.add(new Developer("Ivan5", 1246666, Position.INTERMIDIATE_STRONG, 120));
        developers.add(new Developer("Ivan6", 1246667, Position.INTERMIDIATE_STRONG, 120));
        developers.add(new Developer("Ivan7", 1246668, Position.INTERMIDIATE_STRONG, 120));
        developers.add(new Developer("Ivan8", 1246669, Position.INTERMIDIATE_STRONG, 120));
        developers.add(new Developer("Ivan9", 1246662, Position.INTERMIDIATE_STRONG, 120));
        developers.add(new Developer("Ivan10", 1246662, Position.INTERMIDIATE_STRONG, 120));
        for(Developer dev : developers) {
            dev.show();
        }
        dev.showTotalSalary(dev.totalSalary(employees));
        System.out.println();
        System.out.println();
        System.out.println();

        List<Designer> designers = new ArrayList<Designer>();
        designers.add(new Designer("Ivan002", 1246663, Position.INTERMIDIATE_STRONG, 120));
        designers.add(new Designer("Ivan001", 1246662, Position.INTERMIDIATE_STRONG, 220));
        designers.add(new Designer("Ivan003", 1246664, Position.INTERMIDIATE_STRONG, 150));
        designers.add(new Designer("Ivan004", 1246665, Position.INTERMIDIATE_STRONG, 120));
        designers.add(new Designer("Ivan005", 1246666, Position.INTERMIDIATE_STRONG, 120));
        designers.add(new Designer("Ivan006", 1246667, Position.INTERMIDIATE_STRONG, 120));
        designers.add(new Designer("Ivan007", 1246668, Position.INTERMIDIATE_STRONG, 120));
        designers.add(new Designer("Ivan008", 1246669, Position.INTERMIDIATE_STRONG, 120));
        designers.add(new Designer("Ivan009", 1246662, Position.INTERMIDIATE_STRONG, 120));
        designers.add(new Designer("Ivan0010", 1246662, Position.INTERMIDIATE_STRONG, 120));
        for(Designer des : designers) {
            des.show();
        }
        des.showTotalSalary(des.totalSalary(employees));

    }
}
