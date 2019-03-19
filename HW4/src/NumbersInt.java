import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersInt {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static String Max(int b, int a, int c) {
		return "The max is "+ Math.max(Math.max(c , b), a);
	}
	public static String Min(int a, int b, int c){
		return "The min is "+ Math.min(Math.min(c , b), a);
	}
	
	public static void main(String[]args) throws NumberFormatException, IOException {
	System.out.println("Enter three numbers");
	int a = Integer.parseInt(br.readLine());
	int b = Integer.parseInt(br.readLine());
	int c = Integer.parseInt(br.readLine());
	 
	System.out.println(Max(a, b, c));
	System.out.println(Min(a, b, c));
	
	}	
}
