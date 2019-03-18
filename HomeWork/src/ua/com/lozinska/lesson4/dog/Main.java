package ua.com.lozinska.lesson4.dog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Dog dog1 = inputDogParams();
        Dog dog2 = inputDogParams();
        Dog dog3 = inputDogParams();
        checkName(dog1, dog2, dog3);
        oldestDog(dog1, dog2, dog3);

    }

    private static Dog inputDogParams() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("New DOG!!!__________________________");
        System.out.println("Input lesson4.dog's name, please:");
        String dogName = br.readLine();
        System.out.println("Input lesson4.dog's age, please:");
        int dogAge = Integer.parseInt(br.readLine());
        System.out.println("Input lesson4.dog's breed, please:");
        Breed dogBreed = Breed.valueOf(br.readLine().toUpperCase());
        return new Dog(dogName, dogAge, dogBreed);
    }

    public static boolean checkName(Dog dog1, Dog dog2, Dog dog3) {
        if (dog1.getName().equals(dog2.getName())) {
            System.out.println("There are two dogs with the same name " + dog1.getName());
            return true;
        } else if (dog1.getName().equals(dog3.getName())) {
            System.out.println("There are two dogs with the same name " + dog1.getName());
            return true;
        } else if (dog2.getName().equals(dog3.getName())) {
            System.out.println("There are two dogs with the same name " + dog2.getName());
            return true;
        } else
            System.out.println("There are no two dogs with the same name!");
        return false;
    }

    public static int oldestDog(Dog dog1, Dog dog2, Dog dog3) {
        if ((dog1.getAge() > dog2.getAge()) && (dog1.getAge() > dog3.getAge())) {
            System.out.println("Dog " + dog1.getName() + " is the oldest lesson4.dog. He is " + dog1.getAge() +
                    " years old. And his breed is " + dog1.getBreed());
            return dog1.getAge();
        } else if ((dog2.getAge() > dog1.getAge()) && (dog2.getAge() > dog3.getAge())) {
            System.out.println("Dog " + dog2.getName() + " is the oldest lesson4.dog. He is " + dog2.getAge() +
                    " years old. And his breed is " + dog2.getBreed());
            return dog2.getAge();
        } else if ((dog3.getAge() > dog1.getAge()) && (dog3.getAge() > dog2.getAge())) {
            System.out.println("Dog " + dog3.getName() + " is the oldest lesson4.dog. He is " + dog3.getAge() +
                    " years old. And his breed is " + dog3.getBreed());
            return dog3.getAge();
        } else System.out.println("All dogs have the same names " + dog1.getName());
        return dog1.getAge();

    }
}
