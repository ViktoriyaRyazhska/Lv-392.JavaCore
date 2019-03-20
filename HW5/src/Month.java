import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {
	
	
	
	public static void main(String[]args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int month [] = new int[12];
		month [0] = 31;
		month [1] = 28;
		month [2] = 31;
		month [3] = 30;
		month [4] = 31;
		month [5] = 30;
		month [6] = 31;
		month [7] = 31;
		month [8] = 30;
		month [9] = 31;
		month [10] = 30;
		month [11] = 31;
		
		
	    System.out.println("Enter the number of month:");
		int b = Integer.parseInt(br.readLine());
		
		if(b<0 || b>11) {
			System.out.println("WRONG!!!");
		}
		else {
		System.out.println(month[b]);
		}
		}
   	
	}


