package homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Car[] carArray = new Car[4];

        carArray[0] = new Car("Crossover", 1990, 6);
        carArray[1] = new Car("Convertible", 2017, 5);
        carArray[2] = new Car("Hatchback", 1995, 4);
        carArray[3] = new Car("MPV", 2019, 3);

        System.out.println("Enter the year: ");
        int year = Integer.parseInt(br.readLine());

        for (Car i : carArray) {
            if (i.getYear() == year) {
                System.out.println(i);
            }
        }
        System.out.println(Arrays.toString(InsertionSortCar(carArray)));
    }

    public static Car[] InsertionSortCar(Car arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Car key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getYear() > key.getYear()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
