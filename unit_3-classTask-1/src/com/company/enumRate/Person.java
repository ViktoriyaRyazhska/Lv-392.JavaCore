package com.company.enumRate;

public abstract class Person {

    protected Counter counter = new Counter();

    private String name;

    // Constructors

    public Person() {
    }

    public Person(String name) {
        this.name = name;
        counter.increaseCounter();      // why this use????
    }

    // getters and setters

    public String getName() {
        counter.increaseCounter();      // why this use????
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*    protected void totalCounter() {
        String s = String.format("Total persons: %d\n", counter.getCounter());
        System.out.print(s);
    }*/
}
