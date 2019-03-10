import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Name {
public static void main(String[] args) throws IOException
{
	System.out.println("What is your name?");
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	String name=in.readLine();
	System.out.println("Where are you live, "+name);
	String address=in.readLine();
	System.out.println(name+" live in "+address );
}
}
