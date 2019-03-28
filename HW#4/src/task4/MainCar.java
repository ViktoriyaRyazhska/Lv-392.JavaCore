package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MainCar {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;

		Car[] arr = new Car[4];
		arr[0] = new Car("Hatchback", 2.2);
		arr[1] = new Car("Sedan", 3.0);
		arr[2] = new Car("Crossover", 2.0);
		arr[3] = new Car("Coupe", 1.6);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Put year of " + arr[i].getType() + " year production");
			year = Integer.parseInt(br.readLine());
			arr[i].setYear(year);

		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i +1; j < arr.length; j++) {
				if(arr[i].getYear()>arr[j].getYear()) {
					Car tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}

			}
		}
		Arrays.stream(arr).forEach(System.out::println);
	}

}
