package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1Int {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Put three int numbers: ");
		
		
		int nb1 = Integer.parseInt(br.readLine());
		int nb2 = Integer.parseInt(br.readLine());
		int nb3 = Integer.parseInt(br.readLine());
		
		System.out.println("Max variable is " +Math.max(nb1, Math.max(nb2,nb3)));
		System.out.println("Min variable is " +Math.min(nb1, Math.min(nb2,nb3)));
		
	}

}
