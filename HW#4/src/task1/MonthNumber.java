package task1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonthNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] monthAmount = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.println("Put month number pls");	
		int pn = Integer.parseInt(br.readLine());
		System.out.println("Month amount days: " +monthAmount[--pn]);
		
	}
}
