import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntNumbers {
	public static void main(String[]args ) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numbers [] = new int [10];
		
		System.out.println("Enter 10 numbers: ");
		int sum = 0;
		for(int i = 0; i<numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			if(numbers[i] > 0 && i < 4 ) {
				sum += numbers[i];
				}
			else {
				break;
			}			
		}
		System.out.println(sum);	
		if(sum<=0) {
		int product = 1;
		for(int i = 5; i<numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			if(numbers[i] > 0 && i > 5 ) {
			product *= numbers[i];
		}

	}
		System.out.println(product);
				
}
}
}