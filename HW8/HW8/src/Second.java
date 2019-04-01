import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {
	  public static void main(String[] args) throws IOException {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Write sentence with two space!!!");
			String str = br.readLine();
			System.out.println(str.replaceAll("\\s+"," "));
	  }

}
