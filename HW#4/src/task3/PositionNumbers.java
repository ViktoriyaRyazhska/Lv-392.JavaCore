package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositionNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] numbers = new int[5];
		int product = 1;
		System.out.println("Put 5 numbers: ");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			if (numbers[i]<0) {
				System.out.println("You put negative number!");
				break;
			} if(numbers[i]%2 == 0) {
				product *= numbers[i];
			}
		}

//		minimum and it`s position
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}

		}
//		second positive number
		int spn = 0;
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0 && count < 2) {
				spn = numbers[i];
				count++;
			} 
		} 
//		do we have 2 or more positive numbers
		if (count <= 1) {
			System.out.println("We have one or less positive numbers!");
		}else {
			System.out.println("Second positive number in array: [" +spn+ "]\n" +"Minimum number in array: [" +min+"]" + "\n" + "Product of even numbers: [" + product + "]");
		}
	}
}