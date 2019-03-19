import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static String Numb(float a, float b, float c) {
		if((a <= 5.0 && a >= -5.0) && (b <= 5.0 && b >= -5.0) && (c <=5.0 && c >= -5.0)){
			return "Number is belong to the range [-5,5]";
		}
		return "Number is not belong to the range [-5,5]";
		
	
	}
	public static void main(String[]args) throws NumberFormatException, IOException {
		
		System.out.println("Enter three numbers:");
		float a = Float.parseFloat(br.readLine());
		float b = Float.parseFloat(br.readLine());
		float c = Float.parseFloat(br.readLine());
	
		System.out.println(Numb(a, b, c));

	}

}
