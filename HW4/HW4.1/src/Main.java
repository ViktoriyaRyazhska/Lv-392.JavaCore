import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
public static boolean check(float a)
{
	boolean y=false;
	if(a>=-5&&a<=5)
	{
	y=true;
	}
	return y;
}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<3;i++) {
		float value=Float.parseFloat(in.readLine());
		boolean x=check(value);
		if(x==true) {
		System.out.println("Belong");
		}
		}
	}
	}

