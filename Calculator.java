/* to use this app you should run it, than enter the first number in console + enter, than - second number + enter end one of characters (+-*/) */

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args)
	{
		
		Scanner korystuvach = new Scanner(System.in);
		double a, b, rezult;
		String diya;
				
		a = Double.parseDouble(korystuvach.nextLine());
		b = Double.parseDouble(korystuvach.nextLine());
		diya = korystuvach.nextLine();
		
		if (diya.equals("+"))
		{
			rezult = a + b;
		}	
		else if (diya.equals("-"))
		{
			rezult = a - b;
		}
		else if (diya.equals("*"))
		{
			rezult = a * b;
		}
		else if (diya.equals("/"))
		{
			rezult = a / b;
		}
		else 
		{
			rezult = 0;
		}
		
		
		System.out.println(rezult);
	}
	

}
