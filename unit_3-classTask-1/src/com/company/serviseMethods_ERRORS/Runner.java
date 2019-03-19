package com.company.serviseMethods_ERRORS;

//import Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * in this version project I use class enum Position for calculate salary Employee
 */
public class Runner {

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


/*
        List<Developer> developers = new ArrayList<Developer>();
        developers.add(new Developer("Ivan1", 1246662, Position.INTERMIDIATE_STRONG, 220));
        developers.add(new Developer("Ivan2", 1246662, Position.INTERMIDIATE_STRONG, 120));
        for(Developer dev : developers) {
            dev.show();
        }

        List<Designer> designers = new ArrayList<Designer>();
        designers.add(new Designer("Ivan Ivanov-1", 1246601, Position.INTERMIDIATE_STRONG, 120));
        designers.add(new Designer("Ivan Ivanov-2", 1246602, Position.INTERMIDIATE, 130));
        designers.add(new Designer("Ivan Ivanov-3", 1246603, Position.JUNIOR_PRO, 140));
        designers.add(new Designer("Ivan Ivanov-4", 1246604, Position.SENIOR, 150));
        designers.add(new Designer("Ivan Ivanov-5", 1246605, Position.JUNIOR_STRONG, 160));
        designers.add(new Designer("Ivan Ivanov-6", 1246606, Position.JUNIOR_PRO, 170));
        designers.add(new Designer("Ivan Ivanov-7", 1246607, Position.INTERMIDIATE, 180));
        designers.add(new Designer("Ivan Ivanov-8", 1246608, Position.INTERMIDIATE, 190));
        designers.add(new Designer("Ivan Ivanov-9", 1246609, Position.SENIOR, 145));
        designers.add(new Designer("Ivan Ivanov-10", 1246610, Position.INTERMIDIATE_STRONG, 152));
        for(Designer designer : designers) {
            designer.show();
        }
*/

    }
}
