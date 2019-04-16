import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
	    System.out.println("Put text: ");
	    
	    String s = br.readLine();
	    System.out.println("Vowel Count: " + (s.length() - s.toLowerCase().replaceAll("a|e|i|o|u|", "").length()));


		
	}

}
