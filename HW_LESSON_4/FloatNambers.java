import java.util.Scanner;

public class FloatNambers {

	public static void main(String[] args) {
		
		float a;
		float b;
		float c;
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the first float number, please ");
				a = sc.nextFloat();
				System.out.println("Enter the second float number, please ");
				b = sc.nextFloat();
				System.out.println("Enter the third float number, please ");
				c = sc.nextFloat();
				
				
				if (a > -5 && a < 5) {
					System.out.println("a belongs to the range [-5,5]");				
				}
				else {
					System.out.println("a doesn't belong  to the range [-5,5]");
					
				}
				
				if (b > -5 && b < 5) {
					System.out.println("b belongs to the range [-5,5]");				
				}
				else {
					System.out.println("b doesn't belong  to the range [-5,5]");
					
				}
				
				if (c > -5 && c < 5) {
					System.out.println("c belongs to the range [-5,5]");				
				}
				else  {
					System.out.println("c doesn't belong  to the range [-5,5]");
					
				}
					
	}

}
