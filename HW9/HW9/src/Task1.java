import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static double div(double a, double b) throws Exception  {
		if(b==0) {
			throw new Exception("Second number = 0! Wrong!!!");
		}
		return a/b;
		
	}
	public static void main(String[]args) throws Exception{
		
		try {
			 System.out.println("Enter first  numbers : ");
		     double a = Double.parseDouble(br.readLine());
			 System.out.println("Enter second  numbers : ");
			 double b = Double.parseDouble(br.readLine());
			 System.out.println(div(a,b));
			 br.close();
		} catch (NumberFormatException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	

}
