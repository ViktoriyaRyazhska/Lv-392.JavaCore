package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static homework3.FirstTask.httpErrors;
import static homework3.FirstTask.minMaxNumber;
import static homework3.FirstTask.rangeNumbers;


public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        // First task
        System.out.println("Enter three float numbers : ");
        double n1 = Double.parseDouble(br.readLine());
        double n2 = Double.parseDouble(br.readLine());
        double n3 = Double.parseDouble(br.readLine());

        System.out.println(rangeNumbers(n1, n2, n3));

        System.out.println("Enter three integers : ");
        int m1 = Integer.parseInt(br.readLine());
        int m2 = Integer.parseInt(br.readLine());
        int m3 = Integer.parseInt(br.readLine());
        System.out.println(minMaxNumber(m1, m2, m3));

        System.out.println("Enter the error's number : ");
        int errorNumber = Integer.parseInt(br.readLine());
        System.out.println(httpErrors(errorNumber));

        // class Dog task
        Dog d1 = new Dog("Baxter", Breeds.SiberianHuskies, 4);
        Dog d2 = new Dog("Jacky", Breeds.Collie, 7);
        Dog d3 = new Dog("Recs", Breeds.GermanShepherdDogs, 10);

        if (d1.getName() == d2.getName() || d1.getName() == d3.getName() || d2.getName() == d3.getName()) {
            System.out.println("There are dogs with the same name.");
        }

        if (d1.getAge() > d2.getAge() && d1.getAge() > d3.getAge()) {
            System.out.println("The oldest dog is " + d1.getName() + ", " + d1.getBreed() + ".");
        } else if (d2.getAge() > d3.getAge() && d2.getAge() > d1.getAge()) {
            System.out.println("The oldest dog is " + d2.getName() + ", " + d2.getBreed() + ".");
        } else {
            System.out.println("The oldest dog is " + d3.getName() + ", " + d3.getBreed() + ".");
        }
    }
}
