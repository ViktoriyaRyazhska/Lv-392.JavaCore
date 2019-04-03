package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1Float {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		float flt1;
		float flt2;
		float flt3;
		
		System.out.println("Put three float numbers: ");
		flt1 = Float.parseFloat(br.readLine());
		flt2 = Float.parseFloat(br.readLine());
		flt3 = Float.parseFloat(br.readLine());
		
		if(-5<=flt1 && flt1<=5 && -5<=flt2 && flt2<=5 && -5<=flt3 && flt3<=5) {
			System.out.println("This float numbers are all in range [-5 5]");
		}
		else {
			System.out.println("One or more numbers are not in range [-5 5]");
		}

	}

}
