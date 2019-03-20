import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FiveInteger {
	public static void main(String[]args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numbers [] = new int [5];
		for(int i = 0; i<numbers.length; i++) {
			System.out.println("Enter the number: ");
			numbers[i] = Integer.parseInt(br.readLine());
			if(numbers[i] <0) {
				break;
			}			
		}  
		System.out.println(Arrays.toString(numbers));
		
		int count = 0;
		int min = numbers[0];
		int product = 1;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				count++;
				if (count == 2) {
					System.out.println("The position in array is " + i);
				}
			}
			if (numbers[i] < min) {
				min = numbers[i];
			}
			if (numbers[i] % 2 == 0) {
				product *= numbers[i];
			}
		}
		System.out.println("The min is " + min);
		System.out.println("The product of even numbers is " + product);

	}		
}
