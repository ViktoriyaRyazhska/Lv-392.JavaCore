import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	    System.out.println("Put number: ");
		int number = Integer.parseInt(br.readLine()); 
		
		 for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	      }
 }
}
