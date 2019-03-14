package homework2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Person p1 = new Person("Nick", 1984);
        System.out.println(p1);
        p1.changeName("Bill");
        System.out.println(p1);

        Person p2 = new Person("Rory", 1999);
        System.out.println(p2);

        Person p3 = new Person();
        p3.setName("Jack");
        p3.output();

        Person p4 = new Person();
        p4.setBirthYear(1996);
        p4.output();

        Person p5 = new Person();
        p5.input();
        p5.output();
    }
}
