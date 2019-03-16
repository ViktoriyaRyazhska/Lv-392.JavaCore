import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersInt {
	public static void main(String[]args) throws NumberFormatException, IOException {
	System.out.println("Enter three numbers");
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int a = Integer.parseInt(br.readLine());
	int b = Integer.parseInt(br.readLine());
	int c = Integer.parseInt(br.readLine());
	 
	System.out.println("The max is "+ Math.max(Math.max(c , b), a));
	System.out.println("The min is "+ Math.min(Math.min(c , b), a));
	}
}
