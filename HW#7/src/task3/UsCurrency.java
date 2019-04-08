package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsCurrency {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sentence containing the dollar sign like this [$] ");
		String text = br.readLine();
		
		String pattern = "\\w+ .[0-9]\\d{0,9}.[0-9]{2}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		while (m.find()) {
			System.out.println(text.substring(m.start(), m.end()));
		}

	}

}
