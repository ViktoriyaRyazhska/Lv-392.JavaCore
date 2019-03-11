package Task1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bed {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Write radius of circle");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		float r = Float.parseFloat(br.readLine());
		System.out.println("Area = "+ Math.pow(r,2)*3.1415);
		System.out.println("Perimetr = "+ 2*3.1415*r);
	
	

	}

}