package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1Int {
	
	public  static int maxInt(int nb1, int nb2, int nb3) {
		
		int maxNb = 0;
		
		if ((nb1>nb2) && (nb1>nb3)) {
			maxNb = nb1;
		} else if((nb2>nb1) && (nb2>nb3)) {
			maxNb = nb2;
		} else if((nb3>nb1) && (nb3>nb2)) {
			maxNb = nb3;
		} return maxNb;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Put three int numbers: ");
		
		
		int nb1 = Integer.parseInt(br.readLine());
		int nb2 = Integer.parseInt(br.readLine());
		int nb3 = Integer.parseInt(br.readLine());
		
		System.out.println("Max number: " + maxInt(nb1, nb2, nb3));
		System.out.println("Min number: " + Math.min(nb1, Math.min(nb2,nb3)));
		
		
	}

}
