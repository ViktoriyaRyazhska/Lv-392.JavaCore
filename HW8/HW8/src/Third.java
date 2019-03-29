import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Third {
	public static void main(String[]args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Write sentence with two space!!!");
			String str = br.readLine();
			String pattern = "\\$[1-9]+(\\.[0-9]{0,2})?";
		    Pattern p = Pattern.compile(pattern);
		    Matcher m = p.matcher(str);
		    while (m.find()) {
		         System.out.print(str.substring(m.start(), m.end()) + " ");
		   }
	}

}
