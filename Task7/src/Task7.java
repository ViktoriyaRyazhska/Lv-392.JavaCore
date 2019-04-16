import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
	
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static long calculateFactorial(long n){
	long result = 1;
	for (int i = 1; i <=n; i ++){
		result = result*i;
	}
	return result;
}	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	    System.out.println("Put number: ");
		long n = Long.parseLong(br.readLine()); 
		System.out.println(calculateFactorial(n)); 
		
	}	

}
