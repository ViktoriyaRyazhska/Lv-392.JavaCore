import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Phone {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Country 1 - ");
		int c1=Integer.parseInt(in.readLine());
		System.out.println("Country 2 - ");
		int c2=Integer.parseInt(in.readLine());
		System.out.println("Country 3 - ");
		int c3=Integer.parseInt(in.readLine());
		System.out.println("Time 1 - ");
		int t1=Integer.parseInt(in.readLine());
		System.out.println("Time 2 - ");
		int t2=Integer.parseInt(in.readLine());
		System.out.println("Time 3 - ");
		int t3=Integer.parseInt(in.readLine());
		int sum;
		
		sum=c1*t1;
		System.out.println("Prive per minute 1 " +sum);
		sum=c2*t2;
		System.out.println("Prive per minute 2 " +sum);
		sum=c3*t3;
		System.out.println("Prive per minute 3 " +sum);
		sum=c1*t1+c2*t2+c3*t3;
		System.out.println("Sum "+sum);

	}

}
