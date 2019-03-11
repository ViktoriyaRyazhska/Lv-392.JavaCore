package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calls {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("How much cost per minute talk in first country?");
		int c1=Integer.parseInt(br.readLine());
		System.out.println("How much did you talk (min)?");
		int t1=Integer.parseInt(br.readLine());

		System.out.println("How much cost per minute talk in second country?");
		int c2=Integer.parseInt(br.readLine());
		System.out.println("How much did you talk (min)?");
		int t2=Integer.parseInt(br.readLine());

		System.out.println("How much cost per minute talk in third country?");
		int c3=Integer.parseInt(br.readLine());
		System.out.println("How much did you talk (min)?");
		int t3=Integer.parseInt(br.readLine());
		int c1cost=(c1*t1);
		int c2cost=(c2*t2);
		int c3cost=(c3*t3);
		int summ=c1cost+c2cost+c3cost;
		System.out.println("Call cost in first country = " +c1cost);
		System.out.println("Call cost in second country = " +c2cost);
		System.out.println("Call cost in third country = " +c3cost);
		System.out.println("All calls cost = " +summ);
	}

}
