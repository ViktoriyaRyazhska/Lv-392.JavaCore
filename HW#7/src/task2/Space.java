package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Space {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String regexp = br.readLine();
		regexp = regexp.replaceAll("\\s+", " ");

		System.out.println(regexp);
		
		br.close();

	}

}
