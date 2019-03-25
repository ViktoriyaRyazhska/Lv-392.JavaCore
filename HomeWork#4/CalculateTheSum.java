package myPack;
import java.io.*;
public class CalculateTheSum {
		public static void main(String[]args ) throws NumberFormatException, IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n [] = new int [10];
			System.out.println("Enter 10 integer numbers: ");
			int sum = 0;
			int prod = 1;
			for(int i = 0; i<n.length; i++) {
				n[i] = Integer.parseInt(br.readLine());
				if(n[i] > 0 && i < 4 ) {
					sum += n[i];
					}
				else {
					break;
				}	
			}
			System.out.println(sum);
			{
				if(sum <= 0) {
			for(int i = 5; i<n.length; i++) {
				n[i] = Integer.parseInt(br.readLine());
				if(n[i] > 0 && i > 5 ) {
				prod *= n[i];
			}
		}
			System.out.println(prod);			
	}
	}
}
}