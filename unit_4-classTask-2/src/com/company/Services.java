package com.company;

public class Services {

    public void show(Person p) {
        String s = String.format("Person: %s - %d, %s.\n", p.getName(), p.getAge(), p.getDayRegistration());
        System.out.print(s);
    }

}
