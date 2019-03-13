package ua.com.lozinska.lesson3;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Roman", 1993);
        Person p2 = new Person("Natalya", 1986);
        Person p3 = new Person("Marta", 1990);
        Person p4 = new Person("Orest", 1998);
        Person p5 = new Person("Artur", 1989);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        System.out.println("_____________________");
        System.out.println("Name was changed!");
        System.out.println("_____________________");

        p1.changeName("Petro");
        System.out.println(p1);

    }

}
