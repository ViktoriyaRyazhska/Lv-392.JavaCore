import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

public static int checkMax(int x,int y,int z)
{
	int maxr=0;
	if(x>maxr)
	{
	maxr=x;	
	}
	if(y>maxr)
	{
		maxr=y;
	}
	if(z>maxr)
	{
		maxr=z;
	}
return maxr;
}

public static int checkMin(int x,int y,int z)
{
	int min=0;
	if (x>y)
		min=y;
	if (y>x)
	{
		min=x;
	}
	if(min>z)
	{
	min=z;	
	}
	return min;
}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		int value1=Integer.parseInt(in.readLine());
		int value2=Integer.parseInt(in.readLine());
		int value3=Integer.parseInt(in.readLine());
		int max=0;
		int min=0;
		max=checkMax(value1,value2,value3);
		min=checkMin(value1, value2, value3);
		
		System.out.println(max);
		System.out.println(min);
	}

}
