import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flower {
	public static void main(String[]args) throws NumberFormatException, IOException
	{
	long r;
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	r=Integer.parseInt(in.readLine());
	double area;
	area = Math.PI*r*r;
	area=Math.round(area);
	double peremitr;
	peremitr= Math.PI*2*r;
	System.out.println("Area" +area);
	System.out.println("Peremitr "+ peremitr);
	

}
}