package ua.com.lozinska.lesson5.car;

import java.util.Scanner;

public class Car {
    private String type;
    private int yearOfProduction;
    private int engineCapacity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Car(String type, int yearOfProduction, int engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car "
                + type +
                ", year of production: " + yearOfProduction +
                ", engine capacity: " + engineCapacity +
                '.';
    }

    public static void main(String[] args) {
        Car car[] = new Car[4];
        car[0] = new Car("Miniven", 2018, 3);
        car[1] = new Car("Bus", 2016, 3);
        car[2] = new Car("Sedan", 2019, 2);
        car[3] = new Car("Hetchback", 2018, 3);
        System.out.println("List of cars: ");
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }
        System.out.println();

        System.out.println("Enter year of production: ");
        int yearProd = new Scanner(System.in).nextInt();


        for (int i = 0; i < car.length; i++) {
            if (car[i].getYearOfProduction() == yearProd) {
                System.out.println("All cars with model year: " + yearProd + " ");
                System.out.println("Car: " + car[i].getType() + " with engine capacity: " + car[i].getEngineCapacity() + ".");
                System.out.println("______________________________________________");
            }
        }

        System.out.println("Cars sorted by model year:");
        Car tmp = null;
        for (int i = 0; i < car.length - 1; i++) {
            for (int j = i + 1; j < car.length; j++) {
                if (car[i].getYearOfProduction() < car[j].getYearOfProduction()) {
                    tmp = car[i];
                    car[i] = car[j];
                    car[j] = tmp;
                }
            }
        }
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }


    }
}
