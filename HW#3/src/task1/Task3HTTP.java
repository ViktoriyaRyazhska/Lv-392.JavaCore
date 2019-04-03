package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3HTTP {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.println("Print number of error: ");
		
		int errorNumber = Integer.parseInt(br.readLine());		
		
		HttpError error400 = HttpError.HTTPError400;
		HttpError error402 = HttpError.HTTPError402;
		HttpError error404 = HttpError.HTTPError404;
		
		switch (errorNumber) {
		case 400:
			System.out.println("Error = " +error400);			
			break;
		case 402:
			System.out.println("Error = " +error402);			
			break;
		case 404:
			System.out.println("Error = " +error404);			
			break;
		}
	}

}
