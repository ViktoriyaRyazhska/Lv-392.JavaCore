import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader fibonacciBr = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(fibonacciBr.readLine()); 
		int t1 = 1; 
		int t2 = 1;
		System.out.print("First " + n + " terms: ");

		for (int i = 1; i <= n; ++i) {
			System.out.print(t1 + ", ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}

}
