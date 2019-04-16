import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DollarChange {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Put dollar cost");
		int dollarCost = Integer.parseInt(br.readLine());
		System.out.println("Put hryvna sum");
		int hryvnaSum = Integer.parseInt(br.readLine());
		
		System.out.println("If u change u`r hryvnas to dollar u take " + (hryvnaSum/dollarCost));
	}
	
}
