import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
	public static void main(String[]args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter three numbers:");
		float a = Float.parseFloat(br.readLine());
		float b = Float.parseFloat(br.readLine());
		float c = Float.parseFloat(br.readLine());
		
		if(a <= 5.0 && a >= (-5.0)){
			System.out.println("Number is belong to the range [-5,5]");
		}
		else {
			System.out.println("Number is not belong to the range [-5,5]");
		}
		if(b <= 5.0 && b >= (-5.0)){
			System.out.println("Number is belong to the range [-5,5]");
		}
		else {
			System.out.println("Number is not belong to the range [-5,5]");
		}
		if(c <=5.0 && c >= (-5.0)){
			System.out.println("Number is belong to the range [-5,5]");
		}
		else {
			System.out.println("Number is not belong to the range [-5,5]");
		}
	}

}
