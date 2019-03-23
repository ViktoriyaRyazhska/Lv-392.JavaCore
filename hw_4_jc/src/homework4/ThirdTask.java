package homework4;

import java.io.IOException;

import static homework4.Main.br;

public class ThirdTask {

    public static void main(String[] args) throws IOException {

        int [] numbers = new int[5];

        System.out.println("Enter five numbers: ");

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }


        // minimum number
        int min = numbers[0];
        int imin = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
                imin = i;
            }
        }
        System.out.println("The minimum number " + min + " is on the " + (imin+1) + " position.");


        // second positive number
        int counter = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > 0 ) {
                if (counter < 1) {
                    counter++;
                } else {
                    System.out.println("The second positive number is on the " + (i + 1) + " position.");
                    counter++;
                    break;
                }
            }
        }
        if (counter < 2){
            System.out.println("There is less than two positive numbers.");
        }


        //Organize entering integers until the first negative number. Count the product of all entered
        //even numbers.

        int [] arr = new int[100];
        int i = 0;
        int product = 1;

        System.out.println("Enter your numbers, the program will stop when you enter the negative number.");
        while (true){
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] < 0){
                break;
            }else if (arr[i] % 2 == 0){
                product *= arr[i];
            }
            i++;
        }
        System.out.println("The product of all even numbers is: " + product);
    }
}
