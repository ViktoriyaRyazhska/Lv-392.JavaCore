package homework4;

import java.io.IOException;
import java.util.Arrays;

import static homework4.Main.br;

public class SecondTask {

    public static void main(String[] args) throws IOException {
        int [] numbers = new int[10];
        boolean flag = true;

        System.out.println("Enter ten numbers: ");

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(br.readLine());

            if (numbers[i] < 0 && i < 5) {
                flag = false;
            }
        }

        if (flag){
            int [] sumArray = Arrays.copyOfRange(numbers, 0,5);
            System.out.println("Sum of the first 5 elements = " + Arrays.stream(sumArray).sum());
        } else {
            int product = 1;
            for(int i = 5; i < numbers.length; i++){
                product *= numbers[i];
            }
            System.out.println("Product of the last 5 elements = " + product);
        }
    }
}
