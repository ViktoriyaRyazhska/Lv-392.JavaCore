package homework3;

import java.util.Objects;

public class Dog {
    private String name;
    private Object breed;
    private int age;

    public Dog(String name, Object breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getBreed() {
        return breed;
    }

    public void setBreed(Object breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return getAge() == dog.getAge() &&
                Objects.equals(getName(), dog.getName()) &&
                Objects.equals(getBreed(), dog.getBreed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBreed(), getAge());
    }
}
